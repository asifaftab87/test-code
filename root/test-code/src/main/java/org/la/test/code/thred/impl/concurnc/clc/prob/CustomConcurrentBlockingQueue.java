package org.la.test.code.thred.impl.concurnc.clc.prob;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

public class CustomConcurrentBlockingQueue {

    public static void main(String[] args) {
        BlockingQueue<String> queue = new LinkedBlockingDeque<>();
        queue.offer("Maria");
        queue.offer("Saleh");
        queue.offer("Tom");
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.size());
        System.out.println(queue.contains("Saleh"));
        System.out.println(queue);

        // Special for concurrent queues
        try {
            queue.offer("Jim", 200, TimeUnit.MILLISECONDS);
            queue.poll(300, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(queue);
    }
}
