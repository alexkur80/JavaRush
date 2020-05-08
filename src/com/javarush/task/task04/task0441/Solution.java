package com.javarush.task.task04.task0441;

/* 
Как-то средненько
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] nums = new int[3];
        String name = bufferedReader.readLine();
        nums[0] = Integer.parseInt(bufferedReader.readLine());
        nums[1] = Integer.parseInt(bufferedReader.readLine());
        nums[2] = Integer.parseInt(bufferedReader.readLine());


        for (int i = nums.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (nums[j] > nums[j + 1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                }
            }
        }

        System.out.println(nums[1]);
    }

}

