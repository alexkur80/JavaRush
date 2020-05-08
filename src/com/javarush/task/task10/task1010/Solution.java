package com.javarush.task.task10.task1010;

/* 
Правильный ответ: d = 1.0
*/

public class Solution {
    public static void main(String[] args) {
        int a = 168;
        int b = 4;
        int c = 3;
        int e = 2;
        System.out.println((byte)a);
        double d = (byte) a + b / c / e;

        System.out.println(d);
    }
}
