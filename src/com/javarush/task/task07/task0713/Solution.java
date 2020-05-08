package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> listDiv3 = new ArrayList<>();
        ArrayList<Integer> listDiv2 = new ArrayList<>();
        ArrayList<Integer> listOthers = new ArrayList<>();


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(bufferedReader.readLine()));
        }

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) % 3 == 0 && list.get(i) % 2 == 0) {
                listDiv3.add(list.get(i));
                listDiv2.add(list.get(i));
            } else if (list.get(i) % 3 == 0) {
                listDiv3.add(list.get(i));
            } else if (list.get(i) % 2 == 0) {
                listDiv2.add(list.get(i));
            } else {
                listOthers.add(list.get(i));
            }

        }


        printList(listDiv3);
        printList(listDiv2);
        printList(listOthers);

    }

    public static void printList(ArrayList<Integer> list) {

        for (Integer num : list) {
            System.out.println(num);
        }

    }
}
