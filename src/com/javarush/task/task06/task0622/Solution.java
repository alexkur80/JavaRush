package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int counter = 5;
        int[] numbers = new int[counter];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }


        Arrays.sort(numbers);

// bubble sorting
/*        for (int i = numbers.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (numbers[j] > numbers[j + 1]) {
                    int tmp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tmp;
                }
            }
        }*/

        for (int nums : numbers) {
            System.out.println(nums);
        }
    }
}