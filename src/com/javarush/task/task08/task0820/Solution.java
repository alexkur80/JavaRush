package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.DoublePredicate;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>();
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());

        //напишите тут ваш код

        return result;
    }

    public static Set<Dog> createDogs() {

        Set<Dog> result = new HashSet<>();
        result.add(new Dog());
        result.add(new Dog());
        result.add(new Dog());
        //напишите тут ваш код
        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код

        Set<Object> animals = new HashSet<>(cats);
        animals.addAll(dogs);

        return animals;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {

        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets) {
        for (Object animals : pets) {
                        System.out.println(animals);
        }
        
    }

    //напишите тут ваш код
    public static class Cat {

    }

    public static class Dog {

    }
}
