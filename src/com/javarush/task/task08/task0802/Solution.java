package com.javarush.task.task08.task0802;

/* 
Map из 10 пар
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {

        Map<String, String> veganMap = new HashMap<>();
        veganMap.put("арбуз", "ягода");
        veganMap.put("банан", "трава");
        veganMap.put("вишня", "ягода");
        veganMap.put("груша", "фрукт");
        veganMap.put("дыня", "овощ");
        veganMap.put("ежевика", "куст");
        veganMap.put("жень-шень", "корень");
        veganMap.put("земляника", "ягода");
        veganMap.put("ирис", "цветок");
        veganMap.put("картофель", "клубень");


        Iterator<Map.Entry<String, String>> iterator = veganMap.entrySet()
                .iterator();

        while (iterator.hasNext()) {

            Map.Entry<String, String> pair = iterator.next();
            System.out.println(pair.getKey() + " - " + pair.getValue());

        }
    }
}