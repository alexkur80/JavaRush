package com.javarush.task.task08.task0806;

import java.util.HashMap;
import java.util.Map;

/* 
Коллекция Map из Object
*/

public class Solution {

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("Sim", 5);
        map.put("Tom", 5.5);
        map.put("Arbus", false);
        map.put("Baby", null);
        map.put("Cat", "Cat");
        map.put("Eat", new Long(56));
        map.put("Food", new Character('3'));
        map.put("Gevey", '6');
        map.put("Hugs", 111111111111L);
        map.put("Comp", (double) 123);

        for(Map.Entry<String, Object> mapIteratable : map.entrySet()) {

            System.out.println(mapIteratable.getKey() + " - " + mapIteratable.getValue());
        }




    }
}
