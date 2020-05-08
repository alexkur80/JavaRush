package com.javarush.task.task08.task0814;

import java.util.*;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        Set<Integer> setInteger = new HashSet<>();


        while(setInteger.size() < 20)
        {
            setInteger.add((int) Math.random());
        }

        for (Integer numbers: setInteger) {
            System.out.println(numbers);
        }
        return setInteger;

    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {


        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()) {

            Integer num = iterator.next();
            if (num > 10) {
                iterator.remove();
            }
        }

        return set;
    }

    public static void main(String[] args) {

        removeAllNumbersGreaterThan10(createSet());

    }
}