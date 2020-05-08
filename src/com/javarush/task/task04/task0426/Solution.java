package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {

        int number = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            number = Integer.parseInt(bufferedReader.readLine());
            if (number > 0 && number % 2 == 0) {
                System.out.println("положительное четное число");
            } else if (number > 0 && number % 2 != 0) {
                System.out.println("положительное нечетное число");
            } else if (number < 0 && number % 2 == 0) {
                System.out.println("отрицательное четное число");
            } else if (number == 0) {
                System.out.println("ноль");
            } else {
                System.out.println("отрицательное нечетное число");
            }
        } catch (IOException e) {
            System.err.println("IO Exception");
        } catch (NumberFormatException e) {
            System.err.println("NumberFormatException");
        }
    }
}