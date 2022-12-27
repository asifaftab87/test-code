package org.la.test.code.thred;

public class HRThred {
    public static void main(String[] args) {
        Thread thr = new MyThread() {
            @Override
            public void run() {
                System.out.println("internal main thread");
            }
        };
        thr.start();
    }
}

class MyThread extends Thread {
    public void run() {
        System.out.println("run method");
    }
    public void run(String msg) {
        System.out.println("run method msg: "+msg);
    }
}
