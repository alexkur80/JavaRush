/**
 * Консоль-копилка
 * Вводить с клавиатуры числа и считать их сумму, пока пользователь не введет слово "сумма".
 * Вывести на экран полученную сумму.
 *
 * Подсказка: реализовать считывание с клавиатуры, пока не будет введена определенная строка, например "exit", можно с помощью следующей конструкции:
 *
 * BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
 * while (true)
 * {
 * 	String s = buffer.readLine();
 * 	if (s.equals("exit"))
 * 		break;
 * }
 *
 */

package com.javarush.task.task05.task0529;

/* 
Консоль-копилка
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while (true) {

            String stringFromConsole = bufferedReader.readLine();
            if (stringFromConsole.equals("сумма")) {
                break;
            }
            sum += Integer.parseInt(stringFromConsole);
        }

        System.out.println(sum);

    }
}