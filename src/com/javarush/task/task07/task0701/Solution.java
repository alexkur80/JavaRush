package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[20];

        for(int i = 0; i < 20; i ++) {
            numbers[i] = Integer.parseInt(bufferedReader.readLine());
        }

        bufferedReader.close();
        return numbers;
    }

    public static int max(int[] array) {

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i ++) {

            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}