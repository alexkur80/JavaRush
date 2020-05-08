/**
 * Только для богачей
 * Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: "фамилия" - "зарплата".
 * Удалить из словаря всех людей, у которых зарплата ниже 500.
 *
 *
 * Требования:
 * 1. Программа не должна выводить текст на экран.
 * 2. Программа не должна считывать значения с клавиатуры.
 * 3. Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, Integer состоящих из 10 записей по принципу «фамилия» - «зарплата».
 * 4. Метод removeItemFromMap() должен удалять из словаря всех людей, у которых зарплата ниже 500.
 *
 */

package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> peopleWages = new HashMap<>();
        peopleWages.put("Ivanois", 300);
        peopleWages.put("Ivanois2", 700);
        peopleWages.put("Ivanoi4s", 300);
        peopleWages.put("Ivanoi5s", 700);
        peopleWages.put("Ivano43is", 900);
        peopleWages.put("Ivanois8", 300);
        peopleWages.put("Ivanois9", 350);
        peopleWages.put("Ivanois0", 300);
        peopleWages.put("Ivanois222", 300);
        peopleWages.put("Ivanois23", 600);

        return peopleWages;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet()
                .iterator();

        while (iterator.hasNext()) {

            Map.Entry<String, Integer> pair = iterator.next();
            if (pair.getValue() < 500) {
                iterator.remove();
            }
        }

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }

    }

    public static void main(String[] args) {
        //removeItemFromMap(createMap());
    }
}