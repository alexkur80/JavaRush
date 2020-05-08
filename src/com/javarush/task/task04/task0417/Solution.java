package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num01 = Integer.parseInt(bufferedReader.readLine());
        int num02 = Integer.parseInt(bufferedReader.readLine());
        int num03 = Integer.parseInt(bufferedReader.readLine());

        isEqualNumbers(num01, num02, num03);

    }

    public static void isEqualNumbers(int num01, int num02, int num03) {

        StringBuilder stringBuilder = new StringBuilder();
        String resultString = "";

        if (num01 == num02 && num02 == num03) {
            resultString = stringBuilder.append(String.valueOf(num01))
                    .append(" ")
                    .append(String.valueOf(num01))
                    .append(" ")
                    .append(String.valueOf(num02))
                    .append(" ")
                    .toString();
            System.out.println(resultString);

        } else if (num01 == num02) {
            resultString = stringBuilder.append(String.valueOf(num01))
                    .append(" ")
                    .append(String.valueOf(num02))
                    .toString();
            System.out.println(resultString);

        } else if (num02 == num03) {
            resultString = stringBuilder.append(String.valueOf(num02))
                    .append(" ")
                    .append(String.valueOf(num03))
                    .toString();
            System.out.println(resultString);

        } else if (num01 == num03) {
            resultString = stringBuilder.append(String.valueOf(num01))
                    .append(" ")
                    .append(String.valueOf(num03))
                    .toString();
            System.out.println(resultString);
        }
    }
}