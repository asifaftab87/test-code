package org.la.test.code.thred.impl.concurnc;

public class CountThree {
    
    public static int counter = 0;

    public static void main(String[] args) {
        for (int i=0; i<10; i++) {
            Thread th = new Thread(() ->incrementCounter());
            th.start();
        }
    }

    public static synchronized void incrementCounter() {
        int current = counter;
        System.out.println("Before: "+counter+" thread id: "+Thread.currentThread().getId());
        counter = current + 1;
        System.out.println("After: "+counter+" thread id: "+Thread.currentThread().getId());
    }

}
