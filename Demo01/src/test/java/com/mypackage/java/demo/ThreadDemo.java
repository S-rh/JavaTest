package com.mypackage.java.demo;

public class ThreadDemo {

    public static void main(String[] args) throws InterruptedException {

//        MyThread myThread = new MyThread("sober");
//        myThread.start();
//        MyRunnable runnable = new MyRunnable();
//
//        Thread thread = new Thread(runnable,"sober");
//        thread.start();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println(Thread.currentThread().getName() + "-----------" + i);
                }
            }
        }, "sober");
        thread.start();


        for (int i = 0; i < 1000; i++) {
            System.out.println("main----" + i);
        }

    }

}

class MyThread extends Thread {

    public MyThread (String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {

            System.out.println(getName() + "----------" + i);
        }
    }
}

class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName() + "----------" + i);
        }
    }
}
