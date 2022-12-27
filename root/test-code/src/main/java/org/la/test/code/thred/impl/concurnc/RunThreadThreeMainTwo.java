package org.la.test.code.thred.impl.concurnc;

public class RunThreadThreeMainTwo {

    public static void main(String[] args) {
        Thread th1 = new Thread(new RunThreadThree());
        th1.start();
        try {
            th1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread th2 = new Thread(new RunThreadThree());
        th2.start();
    }
}