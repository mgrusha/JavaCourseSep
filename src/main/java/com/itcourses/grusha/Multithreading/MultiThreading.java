package com.itcourses.grusha.Multithreading;

public class MultiThreading {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new MyThread("Thread 1");
        thread1.start();
        Thread thread2 = new MyThread("Thread 2");
         thread2.start();
Thread.sleep(2000);
         thread1.interrupt();
        thread2.interrupt();
        System.out.println("end");

    }
}

class MyThread extends Thread {

    private final String name;

    public MyThread(String name){
        this.name = name;
    }
    @Override
    public void run() {

        System.out.println(name + " I am alive");
        for (int i = 0; i < 20; i++) {
            System.out.println(name+" "+i);
            try {
                this.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("I am interrupted");
            }
        }
        System.out.println(name +" I am dead");
        this.interrupt();
    }
}