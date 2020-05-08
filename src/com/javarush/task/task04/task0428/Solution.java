package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {


        int counterPositive = 0;
        int[] numbers = numbers(3);

        for (int i = 0; i < numbers.length; i++)
            if (numbers[i] > 0) {
                counterPositive++;
            }

        System.out.println(counterPositive);
    }

    public static int[] numbers(int counter) {

        int[] numbers = new int[counter];
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {

            for (int i = 0; i < counter; i++) {
                numbers[i] = Integer.parseInt(bufferedReader.readLine());
            }

        } catch (IOException e) {
            System.err.println("Error reading line from console");
        } catch (NumberFormatException e) {
            System.err.println("Wrong number format");
        }

        return numbers;
    }
}