package com.javarush.task.task07.task0711;

/* 
Удалить и вставить
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {

        ArrayList<String> list = initialize();

        String string = null;
        for (int i = 0; i < 13; i++) {

            string = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            list.add(0, string);

        }


        for (String str : list) {
            System.out.println(str);
        }


    }

    public static ArrayList<String> initialize() {

        ArrayList<String> list = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {

            for (int i = 0; i < 5; i++) {
                list.add(bufferedReader.readLine());
            }
        } catch (IOException e) {
            System.err.println("IOException" + e);
        }
        return list;
    }
}