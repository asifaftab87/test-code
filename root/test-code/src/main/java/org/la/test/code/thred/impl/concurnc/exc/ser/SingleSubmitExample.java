package org.la.test.code.thred.impl.concurnc.exc.ser;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SingleSubmitExample {

    private static ExecutorService executorService = Executors.newSingleThreadExecutor();

    public static void main(String[] args) {
        Future<Double> doubleFuture = getRandom();
        while (!doubleFuture.isDone()) {
            if (doubleFuture.isCancelled()) {
                System.out.println("Your future was cancelled, sorry for that");
                break;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            System.out.println(doubleFuture.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        executorService.shutdown();
    }

    public static Future<Double> getRandom() {
        return executorService.submit(() -> {
           Thread.sleep(1000);
           return Math.random();
        });
    }
}
