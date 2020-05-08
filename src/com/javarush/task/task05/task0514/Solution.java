package com.javarush.task.task05.task0514;

/* 
Программист создает человека
*/

public class Solution {
    public static void main(String[] args) {
        Person person = new Person();

        person.initialize("Vasa", 50);
    }

    static class Person {
        private String name = "Mr. Incognito";
        private int age;

        public void initialize(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}