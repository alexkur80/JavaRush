package com.javarush.task.task04.task0432;

/* 
Хорошего много не бывает
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(System.in));

        String word = bufferedreader.readLine();
        int counter = Integer.parseInt(bufferedreader.readLine());

        while(counter > 0) {
            System.out.println(word);
            counter--;
        }
    }
}
