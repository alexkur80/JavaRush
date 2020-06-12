package com.javarush.task.task15.task1529;

/* 
Осваивание статического блока
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {

    }

    static {
        //add your code here - добавьте код тут
        try {
            reset();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static CanFly result;

    public static void reset() throws IOException {
        //add your code here - добавьте код тут

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String consoleReading = reader.readLine();

        if ("helicopter".equals(consoleReading)) {
            result = new Helicopter();
        } else if ("plane".equals(consoleReading)) {
            consoleReading = reader.readLine();
            result = new Plane(Integer.parseInt(consoleReading));


        }
    }
}