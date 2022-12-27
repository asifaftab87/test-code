package org.la.test.code.thred;

public class PrintNaturalNum {

    int cnt = 1;
    static int n;

    public void odd() {
        synchronized (this) {
            while (cnt<n) {
                while (cnt % 2 == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(cnt + ",");
                cnt++;
                notify();
            }
        }
    }

    public void even() {
        synchronized (this) {
            while (cnt<n) {
                while (cnt % 2 == 1) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(cnt+".");
                cnt++;
                notify();
            }
        }
    }

    public static void main(String[] args) {
        n = 10;
        PrintNaturalNum pn = new PrintNaturalNum();
        Runnable r1 = () -> pn.even();
        Runnable r2 = () -> pn.odd();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}
