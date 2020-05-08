package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> list = new ArrayList<>();
        while (true) {
            String family = reader.readLine();
            if (family.isEmpty()) {
                break;
            }

            list.add(family);
        }

        // Read the house number
        String city = reader.readLine(); // Считываем название города, записываем в переменную city
        int a = list.indexOf(city) + 1; // Находим номер города в листе. Следующий номер - нужная нам семья
        System.out.println(list.get(a)); // Печатаем семью    }
    }
}
