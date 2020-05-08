/**
 * Нам повторы не нужны
 * Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
 * Удалить людей, имеющих одинаковые имена.
 * <p>
 * <p>
 * Требования:
 * 1. Программа не должна выводить текст на экран.
 * 2. Программа не должна считывать значения с клавиатуры.
 * 3. Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей.
 * 4. Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
 * 5. Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().
 */


package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {

        Map<String, String> persons = new HashMap<>();
        persons.put("Ivanov01", "Petr");
        persons.put("Ivanov02", "Petr");
        persons.put("Ivanov03", "Petr");
        persons.put("Ivanov04", "Petr");
        persons.put("Ivanov05", "Petr21");
        persons.put("Ivanov06", "Petr");
        persons.put("Ivanov07", "Petr2");
        persons.put("Ivanov08", "Petr");
        persons.put("Ivanov09", "Petr");
        persons.put("Ivanov10", "Petr");

        return persons;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {

        List<String> names = new ArrayList<>(map.values());

        for (String str : names) {
            if (Collections.frequency(names, str) > 1) {
                removeItemFromMapByValue(map, str);
            }
        }

        for (Map.Entry<String, String> mapPair : map.entrySet()) {
            System.out.println(mapPair.getKey() + " - " + mapPair.getValue());
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue()
                    .equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}