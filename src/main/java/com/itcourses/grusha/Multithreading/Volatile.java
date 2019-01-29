package com.itcourses.grusha.Multithreading;

public class Volatile {


    private volatile static int counter = 0;

    public static void main(String[] args) {
        new ChangeListener().start();
        new ChangeMaker().start();
    }

    static class ChangeListener extends Thread {
        @Override
        public void run() {
            int value = counter;
            while (value < 5) {
                if (value != counter) {
                    System.out.println("Got Change for counter : "+ counter);
                    value = counter;
                }
            }
        }
    }

    static class ChangeMaker extends Thread {
        @Override
        public void run() {

            int value = counter;
            while (counter < 5) {
                System.out.println("Incrementing counter to " + (value + 1));
                counter = ++value;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
