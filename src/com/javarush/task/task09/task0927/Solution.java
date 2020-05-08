package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
 Map <String, Cat> catMap = new HashMap<>();
 catMap.put("Name01", new Cat("catNameFromConstructor01"));
 catMap.put("Name02", new Cat("catNameFromConstructor02"));
 catMap.put("Name03", new Cat("catNameFromConstructor03"));
 catMap.put("Name04", new Cat("catNameFromConstructor04"));
 catMap.put("Name05", new Cat("catNameFromConstructor05"));
 catMap.put("Name06", new Cat("catNameFromConstructor06"));
 catMap.put("Name07", new Cat("catNameFromConstructor07"));
 catMap.put("Name08", new Cat("catNameFromConstructor08"));
 catMap.put("Name09", new Cat("catNameFromConstructor09"));
 catMap.put("Name10", new Cat("catNameFromConstructor10"));

 return catMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
Set<Cat> catSet = new HashSet<>(map.values());



/*for(Map.Entry<String, Cat> catsMap : map.entrySet()) {
    //System.out.println(catsMap.getValue());
    catSet.add(catsMap.getValue());
}*/



return catSet;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
