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

package com.javarush.task.task07.task0703;

/* 
Общение одиноких массивов
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

        String[] lines = initializeArrayString();
        int[] numbers = initializeArrayIntByArrayStringLength(lines);

        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static int[] initializeArrayIntByArrayStringLength(String[] lines) {

        int[] numbers = new int[lines.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = lines[i].length();
        }
        return numbers;
    }

    public static String[] initializeArrayString() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] lines = new String[10];
        for (int i = 0; i < lines.length; i++) {
            lines[i] = bufferedReader.readLine();
        }
        bufferedReader.close();

        return lines;
    }
}