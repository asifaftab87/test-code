package org.la.test.code.thred.impl.concurnc;

public class CustomThread extends Thread{

    @Override
    public void run() {
        System.out.println("I am custom thread!");
    }
}
