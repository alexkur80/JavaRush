package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);

        System.out.println(jerryMouse);

        Cat tomCat = new Cat("Tom", 30, 50);
        Dog billyDog = new Dog("Billy", 20, 15);
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Cat {
        String name;
        int height;
        int centimeters;

        public Cat(String name, int height, int centimeters) {
            this.name = name;
            this.height = height;
            this.centimeters = centimeters;
        }
    }

    public static class Dog {
        String name;
        int tail;
        int speed;

        public Dog(String name, int tail, int speed) {
            this.name = name;
            this.tail = tail;
            this.speed = speed;
        }
    }
}