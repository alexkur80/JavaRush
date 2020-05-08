package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
Cамая длинная последовательность
*/
public class Solution {



    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        int count = 1;
        int result = 1;

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).intValue() == list.get(i + 1).intValue()) {
                count = count + 1;
            } else {
                count = 1;
            }
            if (count > result) {
                result = count;
            }
        }
        System.out.println(result);
    }
}