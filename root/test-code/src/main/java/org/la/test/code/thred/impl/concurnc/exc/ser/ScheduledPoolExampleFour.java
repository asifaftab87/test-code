package org.la.test.code.thred.impl.concurnc.exc.ser;

import java.util.concurrent.*;

public class ScheduledPoolExampleFour {

    private static ScheduledExecutorService executorService = Executors.newScheduledThreadPool(50);

    public static void main(String[] args) {
        int i = 0;
        executorService.scheduleWithFixedDelay(
                () -> System.out.println(i + " Thread id: "+Thread.currentThread().getId()),
                2000, 500, TimeUnit.MILLISECONDS
            );
        try {
            executorService.awaitTermination(10, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
