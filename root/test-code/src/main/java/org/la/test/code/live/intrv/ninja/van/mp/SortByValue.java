package org.la.test.code.live.intrv.ninja.van.mp;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortByValue {
    public static Map<Integer, Integer> sortByValue(Map<Integer, Integer> map) {
        return map.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    }

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 2);
        map.put(2, 4);
        map.put(3, 5);
        map.put(4, 3);
        map.put(5, 1);
        map.put(6, 7);
        map.put(7, 6);
        Map<Integer, Integer> sortedMap = sortByValue(map);
        System.out.println("Original: "+map);
        System.out.println("Sorted by value: "+sortedMap);
    }
}
