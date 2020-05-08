/**
 *
 * Трикотаж
 * Пару задач назад студенты секретного центра JavaRush создавали класс Cat. Теперь пришла пора реализовать котов во плоти, разумеется по образу и подобию класса Cat, а точнее - основываясь на нём, как на шаблоне. Их - котов - должно быть трое. Наполните этих троих жизнью, то есть, конкретными данными.
 *
 *
 * Требования:
 * 1. Программа не должна считывать данные с клавиатуры.
 * 2. Нужно создать три объекта типа Cat.
 * 3. Класс Cat нельзя изменять.
 * 4. Программа не должна выводить данные на экран.
 */

package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
Cat cat01 = new Cat("Vaska", 10, 5, 50);
Cat cat02 = new Cat("Gaska", 3, 15, 40);
Cat cat03 = new Cat("Baska", 12, 8, 15);


    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}