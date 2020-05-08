/**
 * Кошачья бойня
 * Создать три кота используя класс Cat.
 * Провести три боя попарно между котами.
 * Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
 * Результат каждого боя вывести на экран c новой строки.
 *
 *
 * Требования:
 * 1. Программа не должна считывать данные с клавиатуры.
 * 2. Нужно создать три объекта типа Cat.
 * 3. Нужно провести три боя.
 * 4. Программа должна вывести результат каждого боя с новой строки.
 *
 */

package com.javarush.task.task05.task0505;

/* 
Кошачья бойня
*/

public class Solution {

    public static void main(String[] args) {
        Cat cat01 = new Cat("Barsik", 10, 5, 50);
        Cat cat02 = new Cat("Vaska", 8, 15, 40);
        Cat cat03 = new Cat("Vara", 10, 10, 60);

        System.out.println(cat01.fight(cat02));
        System.out.println(cat01.fight(cat03));
        System.out.println(cat02.fight(cat03));


    }

    public static class Cat {

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageScore = Integer.compare(this.age, anotherCat.age);
            int weightScore = Integer.compare(this.weight, anotherCat.weight);
            int strengthScore = Integer.compare(this.strength, anotherCat.strength);

            int score = ageScore + weightScore + strengthScore;
            return score > 0; // return score > 0 ? true : false;
        }
    }
}
