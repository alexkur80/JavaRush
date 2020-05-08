package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static com.javarush.task.task04.task0429.Solution.numbers;

public class Solution {
    public static void main(String[] args) {

        int counterPositive = 0;
        int counterNegative = 0;
        int[] numbers = numbers(3);

        for (int i = 0; i < numbers.length; i++)
            if (numbers[i] > 0) {
                counterPositive++;
            } else if (numbers[i] < 0) {
                counterNegative++;
            }

        String str1 = "asdasd";
            String str2 = "assdasd";

        System.out.println(str1.equals(str2));

        System.out.println("количество положительных чисел: " + counterPositive);
        System.out.println("количество отрицательных чисел: " + counterNegative);
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