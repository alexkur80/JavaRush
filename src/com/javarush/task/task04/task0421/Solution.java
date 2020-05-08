package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {

        String name01 = null;
        String name02 = null;

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            name01 = bufferedReader.readLine();
            name02 = bufferedReader.readLine();

        } catch (IOException e) {
            System.err.println("Error reading line");
        }

        if (name01.equals(name02)) {
            System.out.println("Имена идентичны");
        } else if (!name01.equals(name02) && name01.length() == name02.length()) {
            System.out.println("Длины имен равны");
        }
    }
}