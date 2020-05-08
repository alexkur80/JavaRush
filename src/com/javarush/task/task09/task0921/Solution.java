package com.javarush.task.task09.task0921;

/* 
Метод в try..catch
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbers = new ArrayList<>();
        while (true) {
            try {
                numbers.add(Integer.parseInt(reader.readLine()));
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NumberFormatException ex) {

                for (Integer number : numbers) {
                    System.out.println(number);
                                    }
                break;
            }
        }
    }
}


