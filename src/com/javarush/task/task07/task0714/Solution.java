package com.javarush.task.task07.task0714;

/* 
Слова в обратном порядке
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {

            for (int i = 0; i < 5; i++) {
                list.add(bufferedReader.readLine());
            }

        } catch (IOException e) {
            System.out.println("IOException" + e);
        }

        list.remove(2);

        for(int i = list.size() - 1; i >= 0 ; i --)
        {
            System.out.println(list.get(i));
        }

        //напишите тут ваш код
    }
}