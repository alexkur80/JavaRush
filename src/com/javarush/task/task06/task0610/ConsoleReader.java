package com.javarush.task.task06.task0610;

/* 
Класс ConsoleReader
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleReader {
    public static String readString() throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        bufferedReader.close();
        return bufferedReader.readLine();
    }

    public static int readInt() throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        bufferedReader.close();
        return Integer.parseInt(bufferedReader.readLine());
    }

    public static double readDouble() throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        bufferedReader.close();
        return Double.parseDouble(bufferedReader.readLine());
    }

    public static boolean readBoolean() throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String trueOrFalse = bufferedReader.readLine();
        bufferedReader.close();
        boolean flag = false;
        if (trueOrFalse.equals("true")) {
            flag = true;
        }
        return flag;
    }

    public static void main(String[] args) throws Exception {

    }
}
