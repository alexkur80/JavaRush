package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

        int[] numbers = getArrayIntInput(3);
        if (numbers[0] == numbers[1] && numbers[1] == numbers[2]) {
            return;
        } else if (numbers[0] == numbers[1] && numbers[1] != numbers[2]) {
            System.out.println("3");
        } else if (numbers[0] != numbers[1] && numbers[1] == numbers[2]) {
            System.out.println("1");
        } else if (numbers[0] != numbers[1] && numbers[1] != numbers[2] && numbers[0] == numbers[2]) {
            System.out.println("2");
        }
    }

    public static int[] getArrayIntInput(int count) {

        int[] numbers = new int[count];
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {

            for (int i = 0; i < count; i++) {
                numbers[i] = Integer.parseInt(bufferedReader.readLine());
            }
        } catch (Exception e) {
            System.err.println("Error inputLine");
            System.exit(1);
        }

        return numbers;
    }
}