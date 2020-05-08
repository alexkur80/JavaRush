package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String, String> map = new HashMap<>();
        map.put("asdasdsad", "sadfdsfsdf1");
        map.put("asdasdsad", "sadfdsfsdf6");
        map.put("asdasdsad", "sadfdsfsdf2");
        map.put("asdasdsad1", "sadfdsfsdf1");
        map.put("asdasdsad2", "sadfdsfsdf2");
        map.put("asdasdsad3", "sadfdsfsdf3");
        map.put("asdasdsad4", "sadfdsfsdf4");
        map.put("asdasdsad5", "sadfdsfsdf5");
        map.put("asdasdsad6", "sadfdsfsdf7");
        map.put("asdasdsad7", "sadfdsfsdf7");

        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
