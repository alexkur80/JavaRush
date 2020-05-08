package com.javarush.task.task09.task0919;

/* 
Деление на ноль
*/

public class Solution {

    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (ArithmeticException e) {
            log(e);
        }
    }


    public static void log(Exception e) {
        System.out.println("Divide by Zero");
        e.printStackTrace();
    }

    public static void divideByZero () {
        int result = 10/0;
        System.out.println(result);
    }

}
