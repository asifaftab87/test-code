package org.la.test.code.practice.mp;

import java.util.*;

public class MapEntrySetExample {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 2);
        map.put(2, 4);
        map.put(3, 5);
        map.put(4, 3);
        map.put(5, 1);
        map.put(6, 7);
        map.put(7, 6);




        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        Set<Integer> i = new HashSet<>();
        List<Integer> l = new ArrayList<>();

        for (Map.Entry en : entries) {
            en.getKey();
            en.getValue();
        }

    }

    public List<String> topKFrequent(String[] words, int k) {
        List<String> result = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (int i=0; i<k; i++) {
            if (map.get(words[i])==null) {
                map.put(words[i], 1);
            } else {
                map.put(words[i], map.get(words[i])+1);
            }
        }
        System.out.println(map);
        return result;
    }
    
}
