/***
 * Выражаемся покороче
 * 1. Создай список строк.
 * 2. Считай с клавиатуры 5 строк и добавь в список.
 * 3. Используя цикл, найди самую короткую строку в списке.
 * 4. Выведи найденную строку на экран.
 * 5. Если таких строк несколько, выведи каждую с новой строки.
 */

package com.javarush.task.task07.task0709;

/* 
Выражаемся покороче
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = initialize();

        int minLength = Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i)
                    .length() < minLength) {

                minLength = list.get(i)
                        .length();
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)
                    .length() == minLength) {
                System.out.println(list.get(i));
            }
        }
    }

    public static ArrayList<String> initialize() {

        ArrayList<String> list = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            for (int i = 0; i < 5; i++) {
                list.add(bufferedReader.readLine());
            }
        } catch (NumberFormatException e) {
            System.err.println("NumberFormatException" + e);
        } catch (IOException e) {
            System.out.println("IOException" + e);
        }
        return list;
    }
}