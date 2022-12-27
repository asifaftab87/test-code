package org.la.test.code.thred.impl.concurnc.exc.ser;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleExecuteExample {

    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        service.execute(()-> System.out.println("{ 1: "+Math.random()+",  thread id: "+Thread.currentThread().getId()+" }"));
        service.execute(()-> System.out.println("{ 2: "+Math.random()+",  thread id: "+Thread.currentThread().getId()+" }"));
        service.execute(()-> System.out.println("{ 3: "+Math.random()+",  thread id: "+Thread.currentThread().getId()+" }"));
        service.execute(()-> System.out.println("{ 4: "+Math.random()+",  thread id: "+Thread.currentThread().getId()+" }"));
        service.shutdown();
    }
}
