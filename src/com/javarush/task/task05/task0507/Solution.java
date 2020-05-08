/**
 *      while ((number = Integer.parseInt(bufferedReader.readLine())) != -1) {
 *             sum += number;
 *             counter++;
 *         }
 *
 */

package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double[] numbers = new double[10];

        int counter = 0;
        int sum = 0;
        int number;

        while ((number = Integer.parseInt(bufferedReader.readLine())) != -1) {
            sum += number;
            counter++;
        }

                double average = (double) sum / counter;
        System.out.println(average);
    }
}