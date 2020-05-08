package com.javarush.task.task03.task0325;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Финансовые ожидания
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader stringBuffer = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(stringBuffer.readLine());


        System.out.println("Я буду зарабатывать $" + num + " в час");

    }
}