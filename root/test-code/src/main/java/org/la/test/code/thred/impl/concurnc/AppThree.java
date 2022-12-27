package org.la.test.code.thred.impl.concurnc;

public class AppThree {

    public static void main(String[] args) {
        CustomThread customThread = new CustomThread();
        Thread th = new Thread(() -> System.out.println("I am runnable"));
        customThread.start();
        th.start();
    }
}
