package com.javarush.task.task04.task0405;

/* 
Задаем количество котов
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cat {
    private static int catsCount = 0;

    public static void setCatsCount(int catsCount) {
        Cat.catsCount = catsCount;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
        int count  = Integer.parseInt(bufferedReader.readLine());
        setCatsCount(count);
        System.out.println(catsCount);
    }
}
