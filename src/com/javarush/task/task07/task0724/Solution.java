/**
 * Семейная перепись
 * Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
 * <p>
 * Примечание:
 * Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
 * <p>
 * Пример вывода:
 * Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
 * Имя: Катя, пол: женский, возраст: 55
 * Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
 * ...
 */

package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

        Human grandDad01 = new Human("Mikola", true, 90);
        System.out.println(grandDad01);

        Human grandDad02 = new Human("Boris", true, 70);
        System.out.println(grandDad02);

        Human grandMom01 = new Human("Alla", false, 71);
        System.out.println(grandMom01);

        Human grandMom02 = new Human("Marusya", false, 80);
        System.out.println(grandMom02);

        Human father = new Human("Igor", true, 45, grandDad01, grandMom01);
        System.out.println(father);

        Human mother = new Human("Mila", false, 43, grandDad02, grandMom02);
        System.out.println(father);

        Human son01 = new Human("Pavel", true, 18, father, mother);
        System.out.println(son01);

        Human son2 = new Human("Igor", true, 21, father, mother);
        System.out.println(son2);

        Human daughter = new Human("Masha", false, 21, father, mother);
        System.out.println(daughter);


        int[] array = {1, 2, 3, 2};
        System.out.println(array);


    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null && this.mother.mother != null) {
                text += ", мать: " + this.mother.name;
                text += ", бабушка: " + this.mother.mother.name;
            }

            return text;
        }
    }
}