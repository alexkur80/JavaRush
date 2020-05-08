/**
 * Самая длинная строка
 * 1. Создай список строк.
 * 2. Считай с клавиатуры 5 строк и добавь в список.
 * 3. Используя цикл, найди самую длинную строку в списке.
 * 4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.
 */

package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {

        strings = new ArrayList<>();

        strings = initialize();
        maxLengthLine(strings);
    }

    public static void maxLengthLine(ArrayList<String> list) {
        int maxLength = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i)
                    .length() > maxLength) {
                maxLength = list.get(i)
                        .length();
            }
        }

        for (String str : list) {
            if (str.length() == maxLength) {
                System.out.println(str);
            }
        }
    }

    public static ArrayList<String> initialize() {
        ArrayList<String> list = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {

            for (int i = 0; i < 5; i++) {
                list.add(bufferedReader.readLine());
            }
        } catch (IOException e) {
            System.out.println("IOException" + e);
        }
        return list;
    }
}