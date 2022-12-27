package org.la.test.code.thred.impl.concurnc.exc.ser;

import java.util.concurrent.*;

public class ScheduledPoolExample {

    private static ScheduledExecutorService executorService = Executors.newScheduledThreadPool(50);

    public static void main(String[] args) {
        Future<Double> doubleFuture = executorService.schedule(() -> {
            Thread.sleep((int)(Math.random() * 200));
            System.out.println("{ 1, Thread id: " +Thread.currentThread().getId() + " }");
            return Math.random();
        }, 100, TimeUnit.MILLISECONDS);
        try {
            System.out.println("future value: " + doubleFuture.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        executorService.shutdown();
    }


}
