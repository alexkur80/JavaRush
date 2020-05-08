package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {


        int countNumbers = 4;

        int[] number = new int[countNumbers];
        for (int i = 0; i < number.length; i++) {
            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            ) {
                number[i] = Integer.parseInt(bufferedReader.readLine());
            } catch (Exception e) {
                System.err.println("Error input int");
                break;
            }
        }

        for (int i = number.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (number[j] > number[j + 1]) {
                    int tmp = number[j];
                    number[j] = number[j + 1];
                    number[j + 1] = tmp;
                }
            }
        }

        System.out.println(number[number.length - 1]);
    }
}
