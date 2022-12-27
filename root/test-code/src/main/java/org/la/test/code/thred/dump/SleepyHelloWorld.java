package org.la.test.code.thred.dump;

public class SleepyHelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello world!\nZzZ...");

        // Keep main thread running for a while longer
        sleep();
        System.out.println("enddddddddddd");
    }
    private static void sleep() {
        try {
            Thread.sleep(600000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
