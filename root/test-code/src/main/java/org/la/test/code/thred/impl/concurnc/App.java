package org.la.test.code.thred.impl.concurnc;

// Github url: https://github.com/BrightBoost/concurrency

public class App {

    public static void main(String[] args) {
        Thread th = new Thread(() -> System.out.println("Runnable: "+
                Thread.currentThread().getId()));
        th.start();
        System.out.println("main: "+Thread.currentThread().getId());
    }
}
