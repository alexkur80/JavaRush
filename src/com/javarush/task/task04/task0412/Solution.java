package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    static int number;

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        try {
            number = Integer.parseInt(bufferedReader.readLine());
        } catch (NumberFormatException e) {
            System.out.println("input correct number");
        }

        // Можно так!
        // System.out.println(a < 0 ? ++a : a * 2);

        if (number > 0) {
            System.out.println(number * 2);
        } else if (number < 0) {
            System.out.println(number + 1);
        } else {
            System.out.println(number);
        }
    }
}