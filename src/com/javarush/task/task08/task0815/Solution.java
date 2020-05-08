package com.javarush.task.task08.task0815;

import java.util.*;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Petrov01", "Petr01");
        map.put("Petrov02", "Petr02");
        map.put("Petrov03", "Petr");
        map.put("Petrov04", "Petr01");
        map.put("Petrov05", "Petr");
        map.put("Petrov06", "Petr");
        map.put("Petrov07", "Petr02");
        map.put("Petrov08", "Petr");
        map.put("Petrov09", "Petr02");
        map.put("Petrov10", "Petr01");

        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {

        int counter = 0;
        for (Map.Entry<String, String> mapHumans : map.entrySet()) {

            if (mapHumans.getValue()
                    .equals(name)) {
                counter++;
            }
        }
        return counter;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet()
                .iterator();

        int counter = 0;
        while (iterator.hasNext()) {
            Map.Entry<String, String> mapIterated = iterator.next();

            if (mapIterated.getKey()
                    .equals(lastName)) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {

    }
}