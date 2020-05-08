/**
 * Родственные связи кошек
 * Задача: У каждой кошки есть имя и кошка-мама.
 * Создать класс, который бы описывал данную ситуацию.
 * Создать два объекта: кошку-дочь и кошку-маму.
 * Вывести их на экран.
 *
 * Новая задача: У каждой кошки есть имя, кот-папа и кошка-мама.
 * Изменить класс Cat так, чтобы он мог описать данную ситуацию.
 * Создать 6 объектов: дедушку (папин папа), бабушку (мамина мама), папу, маму, сына, дочь.
 * Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.
 *
 * Пример ввода:
 * дедушка Вася
 * бабушка Мурка
 * папа Котофей
 * мама Василиса
 * сын Мурчик
 * дочь Пушинка
 *
 * Пример вывода:
 * The cat's name is дедушка Вася, no mother, no father
 * The cat's name is бабушка Мурка, no mother, no father
 * The cat's name is папа Котофей, no mother, father is дедушка Вася
 * The cat's name is мама Василиса, mother is бабушка Мурка, no father
 * The cat's name is сын Мурчик, mother is мама Василиса, father is папа Котофей
 * The cat's name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
 *
 */


package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandDadName = reader.readLine();
        Cat catGrandDad = new Cat(grandDadName);
        System.out.println(catGrandDad);

        String grandMom = reader.readLine();
        Cat catGrandMom = new Cat(grandMom);
        System.out.println(catGrandMom);

        String father = reader.readLine();
        Cat catFather = new Cat(father, null, catGrandDad);
        System.out.println(catFather);

        String mother = reader.readLine();
        Cat catMother = new Cat(mother, catGrandMom, null);
        System.out.println(catMother);

        String son = reader.readLine();
        Cat catSon = new Cat(son, catMother, catFather);
        System.out.println(catSon);

        String daughter = reader.readLine();
        Cat catDaughter = new Cat(daughter, catMother, catFather);
        System.out.println(catDaughter);

    }

    public static class Cat {
        private String name = null;
        private Cat parentMom = null;
        private Cat parentDad = null;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parentMom, Cat parentDad) {
            this.name = name;
            this.parentMom = parentMom;
            this.parentDad = parentDad;

        }

        @Override
        public String toString() {
            if (parentMom == null && parentDad == null)
                return "The cat's name is " + name + ", no mother, no father ";
            else if (parentMom != null && parentDad != null)
                return "The cat's name is " + name + ", mother is " + parentMom.name + ", father is " + parentDad.name;
            else if (parentMom != null && parentDad == null)
                return "The cat's name is " + name + ", mother is " + parentMom.name + ", no father ";
            else if (parentMom == null && parentDad != null) {
                return "The cat's name is " + name + ", no mother, father is " + parentDad.name;
            }
            return "";
        }
    }
}