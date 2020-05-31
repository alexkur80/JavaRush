package com.javarush.task.task14.task1419;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код

        String str = null;
        try {
            str.length();
        } catch (NullPointerException e) {
            exceptions.add(e);
        }

        try {
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            exceptions.add(e);
        }


        try {
            throw new NumberFormatException();
        } catch (NumberFormatException e) {
            exceptions.add(e);
        }


        try {
            throw new NoSuchElementException();
        } catch (NoSuchElementException e) {
            exceptions.add(e);
        }

        try {
            throw new NoSuchMethodException();
        } catch (NoSuchMethodException e) {
            exceptions.add(e);
        }

        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            exceptions.add(e);
        }

        try {
            throw new IndexOutOfBoundsException();
        } catch (IndexOutOfBoundsException e) {
            exceptions.add(e);
        }

        try {
            throw new NegativeArraySizeException();
        } catch (NegativeArraySizeException e) {
            exceptions.add(e);
        }

        try {
            throw new NoSuchFieldException();
        } catch (NoSuchFieldException e) {
            exceptions.add(e);
        }
    }
}
