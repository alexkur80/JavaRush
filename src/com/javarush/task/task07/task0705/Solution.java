/**
 * Один большой массив и два маленьких
 * 1. Создать массив на 20 чисел.
 * 2. Ввести в него значения с клавиатуры.
 * 3. Создать два массива на 10 чисел каждый.
 * 4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
 * 5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
 */

package com.javarush.task.task07.task0705;

/* 
Один большой массив и два маленьких
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] numbers = initialize();
        int[] numbersArraySplitter = splitArray(numbers);

        for (int nums : numbersArraySplitter) {
            System.out.println(nums);
        }
    }

    public static int[] splitArray(int[] numbers) {
        int[] numbersArray01 = new int[10];
        int[] numbersArray02 = new int[10];

        for (int i = 0; i < numbers.length / 2; i++) {
            numbersArray01[i] = numbers[i];
        }

        for (int i = 0; i < numbers.length / 2; i++) {
            numbersArray02[i] = numbers[numbers.length / 2 + i];
        }
        return numbersArray02;
    }

    public static int[] initialize() {

        int[] numbers = new int[20];
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {

            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = Integer.parseInt(bufferedReader.readLine());
            }

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException" + e);
        } catch (IOException e) {
            System.out.println("IOException" + e);
        }

        return numbers;
    }
}