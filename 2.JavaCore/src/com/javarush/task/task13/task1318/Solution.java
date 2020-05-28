package com.javarush.task.task13.task1318;

/* 
Чтение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        readFileOutputConsole();


    }

    public static void readFileOutputConsole() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        InputStream inStream = new FileInputStream(File.separator + reader.readLine());

        int i;
        while ((i = inStream.read())  != -1) {
            System.out.print((char) i);
        }

        inStream.close();
        reader.close();
    }


}