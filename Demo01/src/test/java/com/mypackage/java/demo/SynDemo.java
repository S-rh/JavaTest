package com.mypackage.java.demo;

import java.nio.charset.IllegalCharsetNameException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SynDemo {

    public static void main(String[] args) {
        Ticket1 ticket = new Ticket1();

        Thread t1 = new Thread(ticket, "t1");
        Thread t2 = new Thread(ticket, "t2");
        Thread t3 = new Thread(ticket, "t3");

        t1.start();
        t2.start();
        t3.start();

    }



}


class Ticket implements Runnable {

    private Integer ticket = 100;
    Object lock = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在卖，还剩" + --ticket);
                }
            }
        }
    }
}


class Ticket1 implements Runnable {

    private Integer ticket = 100;
    private Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            lock.lock();
            if (ticket > 0) {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "正在卖，还剩" + --ticket);
            }
            lock.unlock();
        }
    }
}