package com.javarush.task.task16.task1618;

/* 
Снова interrupt
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        //Add your code here - добавь код тут

        TestThread test = new TestThread();
        test.start();
        Thread.sleep(5000);
        test.interrupt();
    }

    //Add your code below - добавь код ниже
    public static class TestThread extends Thread {

        public void run() {
            int i = 0;
            while (!interrupted()) {

                try {
                    System.out.println(i++);
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Child thread interrupted");
                 //   return;
                }

            }
        }
    }
}