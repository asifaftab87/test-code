package org.la.test.code.thred.impl.concurnc.ddlck;

public class DeadLockResolved {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        final String resource1 = "stuck";
        final String resource2 = "forever";

        // First get a lock on resource1 and then try to obtain on resource2
        Thread thread1 = new Thread(() -> {
           synchronized (resource1) {
               System.out.println("thread1 has a lock on resource1");

               // Make sure it's not too fast and avoid deadlock
               try {
                   Thread.sleep(500);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               synchronized (resource2) {
                   System.out.println("thread1 has a lock on resource2");
               }
           }
        });

        // First get a lock on resource2 and then try to obtain on resource1
        Thread thread2 = new Thread(() -> {
           synchronized (resource1) {
               System.out.println("thread2 has a lock on resource1");
               try {
                   Thread.sleep(500);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               synchronized (resource2) {
                   System.out.println("thread2 has a lock on resource2");
               }
           }
        });

        // Start both threads
        thread1.start();
        thread2.start();
    }
}
