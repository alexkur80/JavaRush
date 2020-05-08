/**
 * Реализовать метод fight
 * Реализовать метод boolean fight(Cat anotherCat):
 * реализовать механизм драки котов в зависимости от их веса, возраста и силы.
 * Нужно сравнить каждый критерий по отдельности, и победителем будет тот, у которого больше "победивших" критериев.
 * Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет.
 * Если ничья и никто не выиграл, возвращаем либо true либо false, но должно выполняться условие:
 * если cat1.fight(cat2) возвращает true,
 * то cat2.fight(cat1) должен возвращать false.
 *
 *
 * Требования:
 * 1. Класс Cat должен содержать конструктор без параметров.
 * 2. Класс Cat должен содержать всего три поля: age, weight и strength. Поля должны быть публичные.
 * 3. В классе Cat должен быть метод fight.
 * 4. В методе fight реализовать механизм драки котов в зависимости от их веса, возраста и силы согласно условию.
 * 5. Метод должен возвращать одно и тоже значение, если мы деремся с одним и тем же котом.
 * 6. Если некий кот1 выигрывает у кота кот2, то кот2 должен проигрывать коту кот1.
 *
 */

package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight(int i) {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getStrength(int i) {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int strongScaleCat01 = 0;
        int strongScaleCat02 = 0;

        if ((this.age) > anotherCat.age) {
            strongScaleCat01++;
        } else if ((this.age) < anotherCat.age) {
            strongScaleCat02++;
        }


        if ((this.weight) > anotherCat.weight) {
            strongScaleCat01++;
        } else if ((this.weight) < anotherCat.weight) {
            strongScaleCat02++;
        }

        if ((this.strength) > anotherCat.strength) {
            strongScaleCat01++;
        } else if ((this.strength) < anotherCat.strength) {
            strongScaleCat02++;
        }


        boolean flagResultl = false;
        if (strongScaleCat01 > strongScaleCat02) {
            flagResultl = true;
        }

        return flagResultl;

    }

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.setAge(14);
        cat1.setStrength(12);
        cat1.setWeight(10);

        Cat cat2 = new Cat();
        cat2.setAge(10);
        cat2.setStrength(10);
        cat2.setWeight(11);

/*
        boolean result = cat1.fight(cat2);
        System.out.println("cat1 won cat2 ? " + result);

        boolean result2 = cat2.fight(cat1);
        System.out.println("cat1 won cat2 ? " + result2);
        */

    }
}