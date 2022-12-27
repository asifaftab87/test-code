package org.la.test.code.thred.impl.concurnc;

public class CountFour {
    
    public static int counter = 0;
    public static Object lock = new Object();

    public static void main(String[] args) {
        for (int i=0; i<10; i++) {
            Thread th = new Thread(() ->incrementCounter());
            th.start();
        }
    }

    /** If object lock is instance member object(variable) then it will not effect our program
     *  if object or method is instance then for every new thread it will create every time new object
     *  and hence will not work as expected as synchronized method or object
     */
    public static void incrementCounter() {
        synchronized (lock) {
            int current = counter;
            System.out.println("Before: " + counter + " thread id: " + Thread.currentThread().getId());
            counter = current + 1;
            System.out.println("After: " + counter + " thread id: " + Thread.currentThread().getId());
        }
    }

}
