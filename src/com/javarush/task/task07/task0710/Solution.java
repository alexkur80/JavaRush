package com.javarush.task.task07.task0710;

/* 
В начало списка
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {

        ArrayList<String> arrayList = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {

            for (int i = 0; i < 10; i++) {
                arrayList.add(0, bufferedReader.readLine());
            }

            for (String liens : arrayList) {
                System.out.println(liens);
            }

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException" + e);
        } catch (IOException e) {
            System.out.println("IOException" + e);
        }
    }
}