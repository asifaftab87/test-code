package org.la.att.system.lambda;

public class One {
    public static void main(String[] args) {
        Runnable run = () -> System.out.println("Runnable interface");

        run.run();
    }
}
