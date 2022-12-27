package org.la.test.code.thred.impl.concurnc.exc.ser;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleExecuteExampleTwo {

    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        List<Callable<Integer>> list = new ArrayList<>();
        list.add(() -> 1);
        list.add(() -> 2);
        list.add(() -> 3);
        try {
            Thread.sleep(1000);

            // will invoke any thread, here we created a single thread then anyone can execute
            System.out.println(service.invokeAny(list));
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        service.shutdown();
    }
}