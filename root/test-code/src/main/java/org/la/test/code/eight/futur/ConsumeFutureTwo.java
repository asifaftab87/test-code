package org.la.test.code.eight.futur;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class ConsumeFutureTwo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("main start");
        Future<Integer> future = new FutureTwo().calculate(10);
        System.out.println("future created");
        Integer i = future.get();
        System.out.println("main result: "+i);
        System.out.println("main end");
    }
}
