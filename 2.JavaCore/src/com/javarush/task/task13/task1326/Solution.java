/**
 * Сортировка четных чисел из файла
 * 1. Ввести имя файла с консоли.
 * 2. Прочитать из него набор чисел.
 * 3. Вывести на консоль только четные, отсортированные по возрастанию.
 *
 * Пример ввода:
 * 5
 * 8
 * -2
 * 11
 * 3
 * -5
 * 2
 * 10
 *
 * Пример вывода:
 * -2
 * 2
 * 8
 * 10
 *
 *
 * Требования:
 * 1. Программа должна считывать данные с консоли.
 * 2. Программа должна создавать FileInputStream для введенной с консоли строки.
 * 3. Программа должна выводить данные на экран.
 * 4. Программа должна вывести на экран все четные числа считанные из файла отсортированные по возрастанию.
 * 5. Программа должна закрывать поток чтения из файла(FileInputStream).
 */

package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код

        List<Integer> listIntegers = fileToArray();

        sortEven(listIntegers);
    }

    public static List<Integer> fileToArray() throws IOException {

        List<Integer> listIntegers = new ArrayList<>();


        BufferedReader readerFile = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inStream = new FileInputStream(readerFile.readLine());
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(inStream));

        while (reader2.ready()) {

            listIntegers.add(Integer.parseInt(String.valueOf(reader2.readLine())));

        }

        readerFile.close();
        inStream.close();
        reader2.close();
        return listIntegers;

    }

    public static void sortEven(List<Integer> list) {

        ArrayList<Integer> listSortedEven = new ArrayList<>(list.size());

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int tmp;
                if (list.get(j) < list.get(i)) {
                    tmp = list.get(j);
                    list.set(j, list.get(i));
                    list.set(i, tmp);
                }
            }
        }

        Iterator<Integer> iterator = list.iterator();

        int i;
        while (iterator.hasNext()) {
            if ((i = iterator.next()) % 2 == 0) {
                listSortedEven.add(i);
            }
        }

        for (Integer numbers : listSortedEven) {
            System.out.println(numbers);
        }
    }
}