package com.javarush.task.task09.task0903;

/* 
Кто меня вызывал?
*/

public class Solution {

    public static StackTraceElement[] element = null;

    public static void main(String[] args) {
        method1();

    }

    public static int method1() {
        method2();

        element = Thread.currentThread()
                .getStackTrace();
        int lineNumber = element[2].getLineNumber();
        return lineNumber;

    }

    public static int method2() {
        method3();

        element = Thread.currentThread()
                .getStackTrace();
        int lineNumber = element[2].getLineNumber();
        System.out.println(element[2].getLineNumber());
        return lineNumber;
    }

    public static int method3() {
        method4();
        element = Thread.currentThread()
                .getStackTrace();
        System.out.println(element[2].getLineNumber());
        return element[2].getLineNumber();
    }

    public static int method4() {
        method5();
        element = Thread.currentThread()
                .getStackTrace();
        System.out.println(element[2].getLineNumber());
        return element[2].getLineNumber();


    }

    public static int method5() {
        element = Thread.currentThread()
                .getStackTrace();
        System.out.println(element[2].getLineNumber());
        return element[2].getLineNumber();
    }
}
