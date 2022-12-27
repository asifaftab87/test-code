package org.la.test.code.collctn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapMerge {
    public static void main(String[] args) {
        String[] arr = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven"};
        Map<String, Integer> map = new HashMap<>();
        map.put("six", 6);
        Arrays.stream(arr)
                .forEach(s->
                        map.merge(s, 1, (a, b)-> a-b));
        map.forEach((k, v)-> System.out.println("key: "+k+", value: "+v));
    }
}
