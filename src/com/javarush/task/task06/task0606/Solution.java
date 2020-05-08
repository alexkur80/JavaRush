/**
 *
 String number = bufferedReader.readLine();

 int bufferedReaderLength = number.length();

 for (int i = 0; i < number.length(); i++) {
 //  System.out.println(number.charAt(i));
 int num = Integer.parseInt(String.valueOf(number.charAt(i)));
 *
 */

package com.javarush.task.task06.task0606;

/* 
Чётные и нечётные циферки
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String number = bufferedReader.readLine();

        int bufferedReaderLength = number.length();

        for (int i = 0; i < number.length(); i++) {
            //  System.out.println(number.charAt(i));
            int num = Integer.parseInt(String.valueOf(number.charAt(i)));
            //System.out.println(num);
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even: " + even + " Odd: " + odd);
    }
}