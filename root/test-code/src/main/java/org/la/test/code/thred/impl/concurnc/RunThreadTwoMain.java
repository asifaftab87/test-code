package org.la.test.code.thred.impl.concurnc;

public class RunThreadTwoMain {

    public static void main(String[] args) {
        Thread th = new Thread(new RunThreadTwo());
        th.start();
        th.interrupt();
    }
}
