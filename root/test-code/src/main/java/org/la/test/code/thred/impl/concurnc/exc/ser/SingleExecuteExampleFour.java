package org.la.test.code.thred.impl.concurnc.exc.ser;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleExecuteExampleFour {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(4);
        List<Callable<Integer>> list = new ArrayList<>();
        list.add(() -> 1);
        list.add(() -> 2);
        list.add(() -> 3);

        // will invoke any thread, here we created 4 threads then anyone can execute
        service.invokeAll(list).forEach(fut -> {
            try {
                System.out.println(fut.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });
        service.shutdown();
    }
}
