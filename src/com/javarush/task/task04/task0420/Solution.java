package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

        int[] numbers = intArray(3);
        int[] numbersSorted = getArraySorted(numbers);


        for (int i = numbersSorted.length - 1; i >= 0; i--) {
            System.out.println(numbersSorted[i]);
        }

    }

    public static int[] intArray(int count) throws Exception {

        int[] numbers = new int[count];

        for (int i = 0; i < count; i++) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            numbers[i] = Integer.parseInt(bufferedReader.readLine());

        }
        return numbers;

    }

    public static int[] getArraySorted(int[] numbers) {

        for (int i = numbers.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (numbers[j] > numbers[j + 1]) {
                    int tmp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tmp;
                }
            }
        }
        return numbers;
    }
}