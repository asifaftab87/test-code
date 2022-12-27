package org.la.test.code.thred.impl.concurnc;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CustomReentrantFive {
    
    public static int counter = 0;
    public static Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        for (int i=0; i<10; i++) {
            Thread th = new Thread(() -> {
                try {
                    incrementCounter();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            th.start();
        }
    }

    /** tryLock(time, time unit) method will give a try to lock in given time, if resource is unlock then it will
     * lock and return true else will return false.
     *  This method will throw exception because trying to unlock and resource which doesn't have lock
     *  will result exception
     */
    public static void incrementCounter() throws InterruptedException {
        if (lock.tryLock(9, TimeUnit.MILLISECONDS)) {
            try {
                int current = counter;
                System.out.println("Before: " + counter + " thread id: " + Thread.currentThread().getId());
                counter = current + 1;
                System.out.println("After: " + counter + " thread id: " + Thread.currentThread().getId());
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println("Thread didn't get a lock and is looking for a new task");
        }
    }

}
