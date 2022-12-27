package org.la.test.code.eight.futur;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class ExampleOne {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Future<Integer> future = new SquareCalculator().calculate(10);
        while (!future.isDone()) {
            System.out.println("Calculating.....");
            Thread.sleep(300);
        }
        Integer result = future.get();
        System.out.println("Task have done result: "+result);
    }
}
