package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        int[] houseNumber = initializeHousesFilledPeople();
        countCitizensInHouses(houseNumber);
    }

    public static void countCitizensInHouses(int[] houseNumber) {
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < houseNumber.length; i++) {

            if (i == 0 || i % 2 == 0) {
                sumEven += houseNumber[i];
            } else if (i % 2 != 0) {
                sumOdd += houseNumber[i];
            }
        }
        if (sumEven > sumOdd) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }

    public static int[] initializeHousesFilledPeople() {
        int[] houseNumber = new int[15];
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {

            for (int i = 0; i < 15; i++) {
                houseNumber[i] = Integer.parseInt(bufferedReader.readLine());
            }

        } catch (NumberFormatException e) {
            System.err.println("NumberFormatException" + e);
        } catch (IOException e) {
            System.err.println("IOException" + e);
        }

        return houseNumber;
    }
}