package org.la.test.code.thred.impl.concurnc;

public class RunThreadTwo implements Runnable {

    @Override
    public void run() {
        for (int i=1; i<=10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}
