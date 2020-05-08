package com.javarush.task.task04.task0443;

/* 
Как назвали, так назвали
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String name = bufferedReader.readLine();
        int year = Integer.parseInt(bufferedReader.readLine());
        int month = Integer.parseInt(bufferedReader.readLine());
        int day = Integer.parseInt(bufferedReader.readLine());

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Меня зовут ")
                .append(name)
                .append(".\n")
                .append("Я родился ")
                .append(day)
                .append(".")
                .append(month)
                .append(".")
                .append(year);

        System.out.println(stringBuilder.toString());

    }
}
