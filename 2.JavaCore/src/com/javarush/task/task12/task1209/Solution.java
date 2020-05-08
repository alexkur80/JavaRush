package com.javarush.task.task12.task1209;

/* 
Три метода и минимум
*/

public class Solution {
    public static void main(String[] args) {

    }

    // int min(int, int), long min(long, long), double min(double, double).
    //Напишите тут ваши методы

    public static int min(int num01, int num02) {

        int min = num01;
        if (num01 < num02) {
            min = num01;
        }

        return Math.min(num01, num02);
    }

    public static long min(long num01, long num02) {

        long min = num01;
        if (num01 < num02) {
            min = num01;
        }

        return Math.min(num01, num02);
    }

    public static double min(double num01, double num02) {

        double min = num01;
        if (num01 < num02) {
            min = num01;
        }

        return Math.min(num01, num02);

    }


}
