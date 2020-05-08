package com.javarush.task.task07.task0704;

/* 
Переверни массив
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

        int[] numbers = initialize();

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }

    public static int[] initialize() {

        int[] numbers = null;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            numbers = new int[10];

            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = Integer.parseInt(bufferedReader.readLine());
            }
        } catch (IOException e) {
            System.err.println("Error reading string line" + e);
        } catch (NumberFormatException e) {
            System.err.println("Incorrect number format" + e);
        }
        return numbers;
    }
}