package org.la.test.code.thred.impl.concurnc.clc.prob;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.LinkedBlockingDeque;

public class CollectionInterfaces {

    public static void main(String[] args) {
        ConcurrentMap<String, String> concurrentMap = new ConcurrentHashMap<>();
        concurrentMap.putIfAbsent("Nadesh", "PHP");

        BlockingQueue<String> queue = new LinkedBlockingDeque<>();
        queue.offer("Maria");
    }
}
