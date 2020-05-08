/**
 * Продолжаем мыть раму
 * 1. Создай список из слов "мама", "мыла", "раму".
 * 2. После каждого слова вставь в список строку, содержащую слово "именно".
 * 3. Вывести результат на экран, каждый элемент списка с новой строки.
 */

package com.javarush.task.task07.task0715;

/* 
Продолжаем мыть раму
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("мама");
        list.add("мыла");
        list.add("раму");

        int listSize = list.size();

        int j = 1;
        for (int i = 0; i < listSize; i++) {
            list.add(i + j, "именно");
            j++;
        }

        for (String str : list) {
            System.out.println(str);
        }
    }
}