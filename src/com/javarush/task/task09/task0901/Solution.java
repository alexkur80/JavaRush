package com.javarush.task.task09.task0901;

/* 
Возвращаем StackTrace
*/

public class Solution {
    public static StackTraceElement[] element = null;

    public static void main(String[] args) {
        System.out.println("Hello from main");

        method1();

        element = Thread.currentThread().getStackTrace();

        int i = 0;
        for (StackTraceElement elements: element) {
            System.out.println("[" + i + "] " + elements.getMethodName());
            i++;
        }
        System.out.println("");
    }

    public static StackTraceElement[] method1() {
        System.out.println("Hello from method1");
        method2();
        //напишите тут ваш код

        element = Thread.currentThread()
                .getStackTrace();

        int i = 0;
        for (StackTraceElement elements: element) {
            System.out.println("[" + i + "] " + elements.getMethodName());
            i++;
        }
        System.out.println("");

        return element;

    }

    public static StackTraceElement[] method2() {
        System.out.println("Hello from method2");

        method3();
        //напишите тут ваш код
        element = Thread.currentThread()
                .getStackTrace();

        int i = 0;
        for (StackTraceElement elements: element) {
            System.out.println("[" + i + "] " + elements.getMethodName());
            i++;
        }
        System.out.println("");

        return element;
    }

    public static StackTraceElement[] method3() {
        System.out.println("Hello from method3");

        method4();
        //напишите тут ваш код
        element =  Thread.currentThread()
                .getStackTrace();

        int i = 0;
        for (StackTraceElement elements: element) {
            System.out.println("[" + i + "] " + elements.getMethodName());
            i++;
        }
        System.out.println("");

        return element;
    }

    public static StackTraceElement[] method4() {
        System.out.println("Hello from method4");

        method5();
        //напишите тут ваш код
        element =  Thread.currentThread()
                .getStackTrace();

        int i = 0;
        for (StackTraceElement elements: element) {
            System.out.println("[" + i + "] " + elements.getMethodName());
            i++;
        }
        System.out.println("");

        return element;
    }

    public static StackTraceElement[] method5() {
        System.out.println("Hello from method5");

        element =  Thread.currentThread()
                .getStackTrace();

        int i = 0;
        for (StackTraceElement elements: element) {
            System.out.println("[" + i + "] " + elements.getMethodName());
        i++;
        }
        System.out.println("");

        return element;
    }
}


