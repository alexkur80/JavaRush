/**
 * Класс StringHelper
 * Сделать класс StringHelper, у которого будут 2 статических метода:
 * String multiply(String s, int count) - возвращает строку повторенную count раз.
 * String multiply(String s) - возвращает строку повторенную 5 раз.
 * <p>
 * Пример:
 * Амиго -> АмигоАмигоАмигоАмигоАмиго
 */

package com.javarush.task.task06.task0611;

/* 
Класс StringHelper
*/

public class StringHelper {
    public static String multiply(String s) {
        String result = "";
        StringBuilder stringBuilder = new StringBuilder();
        result = stringBuilder.append(s)
                .append(s)
                .append(s)
                .append(s)
                .append(s)
                .toString();
        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            stringBuilder.append(s);
        }

        result = stringBuilder.toString();
        return result;
    }

    public static void main(String[] args) {

    }
}