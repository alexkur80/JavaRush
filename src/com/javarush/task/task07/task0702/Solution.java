/**
 * Массив из строчек в обратном порядке
 * 1. Создать массив на 10 строк.
 * 2. Ввести с клавиатуры 8 строк и сохранить их в массив.
 * 3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
 *
 *
 * Требования:
 * 1. Программа должна создавать массив на 10 строк.
 * 2. Программа должна считывать 8 строк для массива с клавиатуры.
 * 3. Программа должна выводить на экран 10 строк, каждую с новой строки.
 * 4. Программа должна выводить на экран массив (10 элементов) в обратном порядке.
 */

package com.javarush.task.task07.task0702;

/*
Массив из строчек в обратном порядке
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

        String[] lines = initialize();

        for (int i = lines.length - 1; i >= 0; i--) {
            System.out.println(lines[i]);
        }
    }

    public static String[] initialize() throws IOException {
        String[] lines = new String[10];

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < lines.length - 2; i++) {
            lines[i] = bufferedReader.readLine();
        }
        bufferedReader.close();

        return lines;
    }
}