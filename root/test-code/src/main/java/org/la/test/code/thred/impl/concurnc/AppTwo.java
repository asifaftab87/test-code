package org.la.test.code.thred.impl.concurnc;

public class AppTwo {

    public static void main(String[] args) {
        CustomThread customThread = new CustomThread();
        customThread.start();
    }
}
