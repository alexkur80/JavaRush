package com.javarush.task.task08.task0827;

/* 
Работа с датой
*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {

        String dateLowerCase = date.toLowerCase();

        String dateCorrect = dateLowerCase.substring(0, 1).toUpperCase() + dateLowerCase.substring(1);




              LocalDate parsedDate = LocalDate.parse(dateCorrect, DateTimeFormatter.ofPattern("MMMM d yyyy"));
        int todayIsDay = parsedDate.getDayOfYear();

        boolean flag = false;
        if (todayIsDay % 2 != 0) {
            flag = true;
        }

        return flag;
    }
}
