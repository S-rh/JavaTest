package com.mypackage.java.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);
        MyRunnable02 myRunnable = new MyRunnable02();
        service.submit(myRunnable);
        service.submit(myRunnable);
        service.submit(myRunnable);
        service.shutdown();
    }





}

class MyRunnable02 implements Runnable {

    @Override
    public void run() {
        System.out.println("我要一个教练");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("教练来了： " + Thread.currentThread().getName());
        System.out.println("教我游泳,交完后，教练回到了游泳池");
    }
}