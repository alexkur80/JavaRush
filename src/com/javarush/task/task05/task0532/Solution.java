/**
 * Задача по алгоритмам
 * Написать программу, которая:
 * 1. считывает с консоли число N, которое должно быть больше 0
 * 2. потом считывает N чисел с консоли
 * 3. выводит на экран максимальное из введенных N чисел.
 *
 */

package com.javarush.task.task05.task0532;

/* 
Задача по алгоритмам
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int counterOfNumbers = 0;

        counterOfNumbers = Integer.parseInt(reader.readLine());

        if (counterOfNumbers > 0) {
            int maximum = Integer.MIN_VALUE;
            int[] numbers = new int[counterOfNumbers];
            for (int i = 0; i < counterOfNumbers; i++) {
                numbers[i] = Integer.parseInt(reader.readLine());
                if (numbers[i] > maximum) {
                    maximum = numbers[i];
                }
            }

            System.out.println(maximum);
        }
    }
}