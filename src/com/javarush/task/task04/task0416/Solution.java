package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double minutes = 0;
        try {
            minutes = Double.valueOf(bufferedReader.readLine());
            roadLightColor(minutes);
        } catch (NumberFormatException e) {
            System.err.println("Incorrect number");
        }
    }

    public static void roadLightColor(double minutes) {

        double cycle = minutes % 5;

        if (cycle >= 4 && cycle < 5) {
            System.out.println("красный");
        } else if (cycle >= 3 && cycle < 4) {
            System.out.println("жёлтый");
        } else if (cycle >= 0 && cycle < 3) {
            System.out.println("зелёный");
        }
    }
}