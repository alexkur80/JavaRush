package com.javarush.task.task09.task0922;

/* 
Какое сегодня число?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String dateFromConsole = reader.readLine();


        String pattern = "MMM dd, yyyy";
        SimpleDateFormat newDateFormat = new SimpleDateFormat(pattern, Locale.ENGLISH);

        Date date = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).parse(dateFromConsole);
        String dateOutput = newDateFormat.format(date).toUpperCase();
        System.out.println(dateOutput);






    }
}
