package com.javarush.task.task11.task1123;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndMaximum(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The maximum is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndMaximum(int[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }

        int[] inputArrayCopy = Arrays.copyOf(inputArray, inputArray.length);


/*
        int max = inputArrayCopy[0];
        int min = inputArrayCopy[0];
        for (int i = 0; i < inputArrayCopy.length; i++) {

            if (inputArrayCopy[i] < min) {
                min = inputArrayCopy[i];
            }
            if (inputArrayCopy[i] > max) {
                max = inputArrayCopy[i];
            }
        }*/

        for (int i = 0; i < inputArrayCopy.length - 1; i++) {
            for (int j = i + 1; j < inputArrayCopy.length; j++) {
                int tmp;
                if (inputArrayCopy[j] > inputArrayCopy[i]) {
                    tmp = inputArrayCopy[j];
                    inputArrayCopy[j] = inputArrayCopy[i];
                    inputArrayCopy[i] = tmp;
                }
            }
        }

        for (int numbers : inputArrayCopy) {
            System.out.println(numbers);
        }

        return new Pair<Integer, Integer>(inputArrayCopy[0], inputArrayCopy[inputArrayCopy.length - 1]);
    }

    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
