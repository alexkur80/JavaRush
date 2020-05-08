package com.javarush.task.task08.task0816;

import java.sql.SQLOutput;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);

        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Сталлоне1", dateFormat.parse("JUNE 1 2012"));
        map.put("Сталлоне2", dateFormat.parse("MAY 1 2012"));
        map.put("Сталлоне3", dateFormat.parse("AUGUST 1 2012"));
        map.put("Сталлоне4", dateFormat.parse("MAY 1 2012"));
        map.put("Сталлоне5", dateFormat.parse("SEPTEMBER 1 2012"));
        map.put("Сталлоне6", dateFormat.parse("MAY 1 2012"));
        map.put("Сталлоне7", dateFormat.parse("OCTOBER 1 2012"));
        map.put("Сталлоне8", dateFormat.parse("MAY 1 2012"));
        map.put("Сталлоне9", dateFormat.parse("JANUARY 1 2012"));

        return map;

    }


    public static void removeAllSummerPeople(Map<String, Date> map) {

        Iterator<Map.Entry<String, Date>> iterator = map.entrySet()
                .iterator();

        while (iterator.hasNext()) {

            Map.Entry<String, Date> mapEntry = iterator.next();

            String date = mapEntry.getValue()
                    .toString();


            if (date.contains("Jun") || date.contains("Jul") || date.contains("Aug")) {
                iterator.remove();
            }
        }


    }

    public static void main(String[] args) throws ParseException {

                Integer n=128;
        Integer n2=128;
        System.out.println(n==n2);
    }
}