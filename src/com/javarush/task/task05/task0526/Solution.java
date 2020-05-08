package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {

        Man man01 = new Man("Ivan", 50, "VOlkova 164");
        Man man02 = new Man("Ivan2", 51, "VOlkova 165");
        Woman woman01 = new Woman("Liza", 45, "Masherova");
        Woman woman02 = new Woman("Liza2", 50, "Masherova");

        System.out.println(man01);
        System.out.println(man02);
        System.out.println(woman01);
        System.out.println(woman02);

    }

    public static class Man {
        String name;
        int age;
        String address;


        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        @Override
        public String toString() {
            return name + " " + age + " " + address;
        }
    }

    public static class Woman {
        String name;
        int age;
        String address;


        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        @Override
        public String toString() {
            return name + " " + age + " " + address;
        }
    }
}