package org.la.test.code.thred.impl.concurnc.atomic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample {

    private static AtomicInteger ai = new AtomicInteger(0);

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(5);
        for (int i=0; i<10; i++) {
            service.submit(() -> System.out.println(ai.incrementAndGet() + " id : " +Thread.currentThread().getId()));
        }
        service.shutdown();
    }
}
