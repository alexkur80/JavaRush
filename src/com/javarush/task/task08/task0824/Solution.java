/**
 * Собираем семейство
 * 1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
 * 2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
 * 3. Выведи все объекты Human на экран (Подсказка: используй метод toString() класса Human).
 * <p>
 * <p>
 * Требования:
 * 1. Программа должна выводить текст на экран.
 * 2. Класс Human должен содержать четыре поля.
 * 3. Класс Human должен содержать один метод.
 * 4. Класс Solution должен содержать один метод.
 * 5. Программа должна создавать объекты и заполнять их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей и выводить все объекты Human на экран.
 */

package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {


        Human childrenMarfa = new Human("Marfa", false, 18);
        Human childrenInga = new Human("Inga", false, 7);
        Human childrenAndrey = new Human("Inga", true, 10);

        ArrayList<Human> children = new ArrayList<>();
        children.add(childrenMarfa);
        children.add(childrenInga);
        children.add(childrenAndrey);

        Human momSofia = new Human("Sofia", false, 45, children);
        Human dadPeter = new Human("Peter", true, 50, children);

        ArrayList<Human> parents1 = new ArrayList<>();
        parents1.add(momSofia);

        ArrayList<Human> parents2= new ArrayList<>();
        parents2.add(dadPeter);

        Human grandpaIvan = new Human("Ivan", true, 73, parents1);
        Human grandpaMakar = new Human("Makar", true, 70, parents2);

        Human grandmaKlara = new Human("Klara", false, 70, parents1);
        Human grandmaMelissa = new Human("Melissa", false, 66, parents2);


    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();


        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
          System.out.println(this.toString());

        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
         System.out.println(this.toString());

        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();

            //if (this.children == null) return text;

            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
