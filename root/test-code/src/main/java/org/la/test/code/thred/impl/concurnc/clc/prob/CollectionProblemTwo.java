package org.la.test.code.thred.impl.concurnc.clc.prob;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CollectionProblemTwo {

    public static void main(String[] args) {
        Map<String, String> stringStringMap = new ConcurrentHashMap<>();
        stringStringMap.put("Maaike", "Java");
        stringStringMap.put("Remsy", "C#");
        for (String k : stringStringMap.keySet()) {
            System.out.println(k + " Loves coding " + stringStringMap.get(k));
            stringStringMap.remove(k);
        }
    }
}
