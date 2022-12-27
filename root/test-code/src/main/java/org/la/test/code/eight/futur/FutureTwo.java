package org.la.test.code.eight.futur;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureTwo {

    private ExecutorService executor = Executors.newSingleThreadExecutor();

    public Future<Integer> calculate(Integer input) {
        return executor.submit(() -> {
            int i = 0;
            for (; i<=10; i++) {
                Thread.sleep(1000);
                System.out.println("thread is running");
            }
            System.out.println("future end");
           return i;
        });
    }
}
