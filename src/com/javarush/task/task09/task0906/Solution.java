package com.javarush.task.task09.task0906;

/* 
Логирование стек-трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
    String className = stackTrace[2].getClassName();
    String methodName = stackTrace[2].getMethodName();
        System.out.println(className + ": " +methodName + ": " + s);

    }
}
