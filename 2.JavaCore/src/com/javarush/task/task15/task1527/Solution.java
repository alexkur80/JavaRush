package com.javarush.task.task15.task1527;

/* 
Парсер реквестов
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        //add your code here
        String linkRaw = linkReadConsole();
        String linkParsed = linkParsing(linkRaw);
        System.out.println(linkParsed);

        linkParsingAlert(linkRaw);


    }

    public static String linkReadConsole() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String link = reader.readLine();
        reader.close();
        return link;
    }

    public static String linkParsing(String link) {

        Pattern pattern = Pattern.compile("(?<=\\?|\\&)(\\w+)");
        Matcher matcher = pattern.matcher(link);

        StringBuilder stringbuilder = new StringBuilder();
        while (matcher.find()) {
            stringbuilder.append(matcher.group())
                    .append(" ");
        }

        return stringbuilder.toString()
                .trim();
    }

    public static void linkParsingAlert(String link) {

        List<String> listObj = new ArrayList<>(); // Не знаем, сколько "obj" будет в строке, так что создаем list для хранения промежуточных результатов

        Pattern pattern = Pattern.compile("(?<=\\?obj=|\\&obj=)([a-zA-Z.0-9]+)", Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(link);
        StringBuilder stringbuilder = new StringBuilder();

        while (matcher.find()) {
            listObj.add(stringbuilder.append(matcher.group())
                    .toString());
            stringbuilder.setLength(0);

        }
        for (String str : listObj) {


            try {
                Double number = Double.parseDouble(str);
                alert(number);
            } catch (NumberFormatException e) {
                alert(str);
            }
        }

    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}