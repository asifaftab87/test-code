package org.la.test.code.thred.impl.concurnc.clc.prob;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;

public class CustomConcurrentSkipList {

    public static void main(String[] args) {
        Set<String> set = new ConcurrentSkipListSet<>();
        set.add("Tim");
        set.add("Pascal");
        set.add("Elias");
        set.forEach(System.out::println);

        Map<String, String> map = new ConcurrentSkipListMap<>();
        map.put("Guitar", "Jesse");
        map.put("Bass", "Job");
        map.put("Piano", "Sietske");
        map.forEach((k, v) -> System.out.println(k +": " + v));
    }
}
