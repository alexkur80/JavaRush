/**
 *Суммирование
 * Вводить с клавиатуры числа.
 * Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершить программу.
 * -1 должно учитываться в сумме.
 *
 * Подсказка: один из вариантов решения этой задачи, использовать конструкцию:
 *
 * while (true) {
 *     int number = считываем число;
 *     if (проверяем, что number -1)
 *         break;
 * }
 *
 * Требования:
 * 1. Программа должна считывать числа c клавиатуры.
 * 2. Если пользователь ввел -1, программа должна вывести сумму всех введенных чисел на экран и завершиться.
 * 3. Программа должна посчитать сумму введенных чисел и вывести её на экран.
 * 4. В программе должен использоваться цикл for, while или do-while.
 *
 */

package com.javarush.task.task04.task0442;

/* 
Суммирование
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int i = 0;
        int[] numbers = new int[100];
        while (true) {
            numbers[i] = Integer.parseInt(bufferedReader.readLine());

            if (numbers[i] == -1) {
                break;
            }
            i++;
        }

        int sum = 0;
        for (int j = 0; j < numbers.length - 1; j++) {
            sum += numbers[j];
        }
        System.out.println(sum);
    }
}