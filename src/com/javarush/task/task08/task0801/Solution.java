package com.javarush.task.task08.task0801;

/* 
Set из растений
*/

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Solution {
    public static void main(String[] args) {
        Set<String> vegetablesSet = new HashSet<>();
        vegetablesSet.add("арбуз");
        vegetablesSet.add("банан");
        vegetablesSet.add("вишня");
        vegetablesSet.add("груша");
        vegetablesSet.add("дыня");
        vegetablesSet.add("ежевика");
        vegetablesSet.add("женьшень");
        vegetablesSet.add("земляника");
        vegetablesSet.add("ирис");
        vegetablesSet.add("картофель");

        Iterator<String> iterator  = vegetablesSet.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}