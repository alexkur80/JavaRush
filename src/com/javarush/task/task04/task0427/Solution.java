package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            int number = Integer.parseInt(bufferedReader.readLine());
            int numberLength = String.valueOf(number)
                    .length();

            if (number < 1 || number > 999) {
                return;
            } else if (number % 2 == 0 && numberLength == 1) {
                System.out.println("четное однозначное число");
            } else if (number % 2 == 0 && numberLength == 2) {
                System.out.println("четное двузначное число");
            } else if (number % 2 == 0 && numberLength == 3) {
                System.out.println("четное трехзначное число");
            } else if (number % 2 != 0 && numberLength == 1) {
                System.out.println("нечетное однозначное число");
            } else if (number % 2 != 0 && numberLength == 2) {
                System.out.println("нечетное двузначное число");
            } else if (number % 2 != 0 && numberLength == 3) {
                System.out.println("нечетное трехзначное число");
            }
        } catch (IOException e) {
            System.err.println("Error IO");
        } catch (NumberFormatException e) {
            System.out.println("Error NumberFormat");
            e.printStackTrace();
        }
    }
}