package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int num01 = Integer.parseInt(bufferedReader.readLine());
        int num02 = Integer.parseInt(bufferedReader.readLine());

        if (num01 > 0 && num02 > 0) {
            System.out.println("1");
        } else if (num01 < 0 && num02 > 0) {
            System.out.println("2");
        } else if (num01 < 0 && num02 < 0) {
            System.out.println("3");
        } else if ((num01 > 0 && num02 < 0)) {
            System.out.println("4");
        }
    }
}