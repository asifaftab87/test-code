package org.la.test.code.util;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapUtil {

    /**
     * Returns map is sorted by value and it is LinkedHashMap which maintain insertion order
     */
    public static Map<String, Integer> mapSortByValue(Map<String, Integer> map) {
        return map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, LinkedHashMap::new
                ));
    }

    /**
     * Returns map is sorted by value in descending order and it is LinkedHashMap which maintain insertion order
     */
    public static Map<String, Integer> mapSortByValueDesc(Map<String, Integer> map) {
        return map.entrySet().stream()
                .sorted((m1, m2) -> -m1.getValue().compareTo(m2.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, LinkedHashMap::new
                ));
    }

    /**
     * Returns map is sorted by key and it is LinkedHashMap which maintain insertion order
     */
    public static Map<String, Integer> mapSortByKey(Map<String, Integer> map) {
        return map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                        Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, LinkedHashMap::new
                ));
    }

    /**
     * Returns map is sorted by key in descending order and it is LinkedHashMap which maintain insertion order
     */
    public static Map<String, Integer> mapSortByKeyDesc(Map<String, Integer> map) {
        return map.entrySet().stream()
                .sorted((m1, m2) -> -m1.getKey().compareTo(m2.getKey()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, LinkedHashMap::new
                ));
    }

    /** Count number/frequency of characters and placed in map */
    public static Map<Character, Integer> countChar(String ms) {
        Map<Character, Integer> map = new HashMap<>();

        // Merge will add value 1 to the existing value of a key if found in map
        // if not found then will add key with initial value 1
        ms.chars().forEach(i -> map.merge((char)i, 1, (a, b) -> a+b));
        return map;
    }

    public static void main(String[] args) {
        countChar("abefeasdcafdefd");
    }
}