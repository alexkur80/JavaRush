package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    private int left;
    private int top;
    private int width;
    private int height;

    public void initialize(int left, int top, int width, int height) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    public void initialize(int top, int width, int height) {
        this.top = top;
        this.width = width;
        this.height = height;
    }

    public void initialize(int top, int height) {
            this.top = top;
        this.height = height;
    }

    public void initialize(int left) {
        this.left = left;


    }


    public static void main(String[] args) {

    }
}
