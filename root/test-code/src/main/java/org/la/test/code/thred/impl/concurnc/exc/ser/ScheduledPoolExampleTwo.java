package org.la.test.code.thred.impl.concurnc.exc.ser;

import java.util.concurrent.*;

public class ScheduledPoolExampleTwo {

    private static ScheduledExecutorService executorService = Executors.newScheduledThreadPool(50);

    public static void main(String[] args) {
        Future<Double> doubleFuture = executorService.schedule(() -> {
            Thread.sleep((int)(Math.random() * 200));
            System.out.println("{ 1, Thread id: " +Thread.currentThread().getId() + " }");
            return Math.random();
        }, 1000, TimeUnit.MILLISECONDS);
        try {
            System.out.println("future value: " + doubleFuture.get(1001, TimeUnit.MILLISECONDS));
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
            doubleFuture.cancel(true);
        }
        if (doubleFuture.isCancelled()) {
            System.out.println("sorry, but future was cancelled");
        }
        if (doubleFuture.isDone()) {
            System.out.println("I'm done");
        }
        executorService.shutdown();
    }


}
