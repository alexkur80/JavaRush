package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number01 = Integer.parseInt(bufferedReader.readLine());
        int number02 = Integer.parseInt(bufferedReader.readLine());

        System.out.println(compareInt(number01, number02));

    }

    public static int compareInt(int number01, int number02) {

        return (number01 >= number02) ? number02 : number01;

    }
}