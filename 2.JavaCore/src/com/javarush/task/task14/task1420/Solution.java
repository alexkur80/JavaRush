package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {

        List<Integer> numbers = inputNumbers();
        int nod = nod(numbers.get(0), numbers.get(1));
        System.out.println(nod);

    }


    protected static List<Integer> inputNumbers() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbers = new ArrayList<>();

        Integer number = null;
        int numberOfNumbers = 2;

        for (int i = 0; i < numberOfNumbers; i++) {
            number = Integer.parseInt(reader.readLine());
            if (number > 0) {
                numbers.add(number);
            } else {
                System.out.println("wrong");
                throw new NumberFormatException();
            }
        }

        return numbers;
    }

    protected static int nod(int number01, int number02) {
        if (number02 == 0)
            return number01;

        return nod(number02, number01 % number02);
    }
}