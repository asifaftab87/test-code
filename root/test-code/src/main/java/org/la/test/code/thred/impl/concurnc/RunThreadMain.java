package org.la.test.code.thred.impl.concurnc;

public class RunThreadMain {

    public static void main(String[] args) {
        Thread th = new Thread(new RunThread());
        th.start();

        Thread th1 = new Thread(() -> System.out.println("runnable run method lambda"));
        th1.start();
    }
}
