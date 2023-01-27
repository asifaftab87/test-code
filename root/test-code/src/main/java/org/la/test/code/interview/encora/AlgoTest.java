package org.la.test.code.interview.encora;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.*;

public class AlgoTest {

    Map<String, Integer> map = new HashMap<>();

    public static void main(String[] args) {

        String[] key = {"k1", "k2", "k3"};
        AlgoTest at = new AlgoTest();
        at.method(key);
    }
    public void method(String[] key) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        for (String k: key) {
            Callable<Integer> callable = () -> read(k);
            Future<Integer> fv = es.submit(callable);
            if (fv.isDone()) {
                try {
                    System.out.println(fv.get());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public Integer read(String key) {
        synchronized (this) {
            return map.get(key);
        }
    }
}
