package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        input();

    }

    public static void input() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String value;
        while (true) {
            value = reader.readLine();

            if ("exit".equals(value)) {
                break;
            }

            try {
                if (value.contains(".")) {
                    print(Double.parseDouble(value));
                    continue;
                }
            } catch (Exception e) {
            }


            try {
                if (Short.parseShort(value) > 0 && Short.parseShort(value) < 128) {
                    print(Short.parseShort(value));
                    continue;
                }
            } catch (Exception e) {
            }

            try {
                if (Integer.parseInt(value) <= 0 || Integer.parseInt(value) >= 128) {
                }
                print(Integer.parseInt(value));
                continue;

            } catch (Exception e) {
            }
            print(value);
        }

        reader.close();


    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}