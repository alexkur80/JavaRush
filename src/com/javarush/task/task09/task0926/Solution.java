package com.javarush.task.task09.task0926;

import java.util.ArrayList;
import java.util.List;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> intList = new ArrayList<>();
        intList.add(new int[]{1, 2, 4, 2, 2});
        intList.add(new int[]{5, 1});
        intList.add(new int[]{4, 5, 1, 0});
        intList.add(new int[]{7, 2, 1, 3, 1, 1, 9});
        intList.add(new int[0]);
        return intList;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}