package com.javarush.task.task08.task0809;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Время для 10 тысяч вставок
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getInsertTimeInMs(new ArrayList()));
        System.out.println(getInsertTimeInMs(new LinkedList()));
    }

    public static long getInsertTimeInMs(List list) {
        // напишите тут ваш код
        long timeStart = System.nanoTime();
        insert10000(list);

        long timefinish = System.nanoTime();

        long performanceTime =(timefinish - timeStart) / 1000000;
        return performanceTime;

    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }
}
