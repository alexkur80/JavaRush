package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int numSeconds = 4;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        //add your code here - добавь код тут
        clock.join();
        Thread.sleep(3500);
        clock.interrupt();
        System.out.println(clock.isInterrupted());
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            //add your code here - добавь код тут
            for (int i = Solution.numSeconds; i > 0; i--) {
                System.out.println(Solution.numSeconds--);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Прервано!");
                    return;
                }
            }
            System.out.println("Марш!");
        }
    }
}
