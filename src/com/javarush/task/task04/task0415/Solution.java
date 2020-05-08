package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {


    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int lineA = 0;
        int lineB = 0;
        int lineC = 0;
        try {
            lineA = Integer.parseInt(bufferedReader.readLine());
            lineB = Integer.parseInt(bufferedReader.readLine());
            lineC = Integer.parseInt(bufferedReader.readLine());
            String isTriangleExistResult = ifTriangleExist(lineA, lineB, lineC);
            System.out.println(isTriangleExistResult);
        } catch (NumberFormatException e) {
            System.err.println("Incorrect IO");
        } catch (IOException e) {
            System.err.println("Error reading line");
        }


    }

    public static String ifTriangleExist(int lineA, int lineB, int lineC) {

        String isTriangleExist = (lineC >= (lineA + lineB) || lineB >= (lineA + lineC) || lineA >= (lineB + lineC)) ? "Треугольник не существует." : "Треугольник существует.";
        return isTriangleExist;

    }
}