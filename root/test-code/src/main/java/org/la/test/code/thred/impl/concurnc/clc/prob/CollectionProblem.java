package org.la.test.code.thred.impl.concurnc.clc.prob;

import java.util.HashMap;
import java.util.Map;

public class CollectionProblem {

    public static void main(String[] args) {
        Map<String, String> stringStringMap = new HashMap<>();
        stringStringMap.put("Maaike", "Java");
        stringStringMap.put("Remsy", "C#");
        for (String k : stringStringMap.keySet()) {
            System.out.println(k + " Loves coding " + stringStringMap.get(k));
            stringStringMap.remove(k);
        }
    }
}
