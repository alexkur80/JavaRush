/**
 *
 * озможно, кому-то будет полезно:
 *
 * При вызове из main метода method1() получается следующая последовательность:
 * 1) main вызывает method1()
 * 2) method1() вызывает method2()
 * 3) method2() вызывает method3()
 * 4) method3() вызывает method4()
 * 5) method4() вызывает method5()
 * 6) method5() вызывает method6()
 * 7) method6() вызывает method7()
 * 8) method7() вызывает method8()
 * 9) method8() вызывает method9()
 * 10) method9() вызывает method10()
 * 11) method10() вызывает getStackTrace()
 * 12) собственно сам getStackTrace()
 *
 * Итого: 12 элементов массива Стека и, соответственно, длина этого массива method1().length тоже равна 12.
 *
 * А при вызове из main метода method10() получается следующая последовательность:
 * 1) main вызывает method10()
 * 2) method10() вызывает getStackTrace()
 * 3) собственно сам getStackTrace()
 *
 * Итого: 3 элемента массива Стека и, соответственно, длина этого массива method10().length тоже равна 3.
 */

package com.javarush.task.task09.task0904;

/* 
Стек-трейс длиной 10 вызовов
*/

public class Solution {
    public static void main(String[] args) {
        int stackTraceLength = method1().length - method10().length + 1;
        System.out.println(stackTraceLength);
    }
    public static StackTraceElement[] method1() {
        return method2();
    }

    public static StackTraceElement[] method2() {
        //напишите тут ваш код
       return method3();
    }

    public static StackTraceElement[] method3() {
        //напишите тут ваш код
        return method4();

    }

    public static StackTraceElement[] method4() {
        //напишите тут ваш код
        return method5();

    }

    public static StackTraceElement[] method5() {
        //напишите тут ваш код
        return method6();

    }

    public static StackTraceElement[] method6() {
        //напишите тут ваш код
        return method7();

    }

    public static StackTraceElement[] method7() {
        //напишите тут ваш код
        return method8();

    }

    public static StackTraceElement[] method8() {
        //напишите тут ваш код
        return method9();

    }

    public static StackTraceElement[] method9() {
        return method10();
    }

    public static StackTraceElement[] method10() {


        return Thread.currentThread()
                .getStackTrace();
    }

}