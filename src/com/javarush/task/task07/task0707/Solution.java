package com.javarush.task.task07.task0707;

/* 
Что за список такой?
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
list.add("sadsdfsdsdf1");
list.add("sadsdfsssddf2");
list.add("sadsdfssdf3");
list.add("sadsdfdsdfsdfsdffs2sdf4");
list.add("ssadasadsdfssdf5");

        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
