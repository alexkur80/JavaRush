package com.javarush.task.task04.task0423;

/* 
Фейс-контроль
*/

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        String name = "";
        int age = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {

            name = bufferedReader.readLine();
            age = Integer.parseInt(bufferedReader.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        }

        if (age > 20) {
            System.out.println("И 18-ти достаточно");
        }
    }
}