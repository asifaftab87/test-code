package org.la.test.code.thred.impl.concurnc;

public class RunThreadThreeMain {

    public static void main(String[] args) {
        Thread th1 = new Thread(new RunThreadThree());
        th1.start();
        Thread th2 = new Thread(new RunThreadThree());
        th2.start();
    }
}
