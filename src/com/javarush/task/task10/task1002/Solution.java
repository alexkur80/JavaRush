package com.javarush.task.task10.task1002;

/* 
Задача №2 на преобразование целых типов
*/

public class Solution {
    public static void main(String[] args) {
        int a = 15;
        int b = 4;
        float c1 = a / b;
        float c2 = (float) (a / b);
        System.out.println("c2: " + c2);
        float c = (float) a / b;
        float c3 =  a / b;
        System.out.println("c3:" + c3);


        System.out.println("c:" + c);
        double d = a * 1e-3 + c;

        System.out.println(d);
    }
}
