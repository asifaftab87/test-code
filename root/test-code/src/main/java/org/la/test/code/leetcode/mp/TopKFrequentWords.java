package org.la.test.code.leetcode.mp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
    Top K Frequent Words
    Given an array of strings words and an integer k, return the k most frequent strings.
    Return the answer sorted by the frequency from highest to lowest. Sort the words with the same
    frequency by their lexicographical order.

    Example 1:
    Input: words = ["i","love","leetcode","i","love","coding"], k = 2
    Output: ["i","love"]
    Explanation: "i" and "love" are the two most frequent words.
    Note that "i" comes before "love" due to a lower alphabetical order.

    Example 2:
    Input: words = ["the","day","is","sunny","the","the","the","sunny","is","is"], k = 4
    Output: ["the","is","sunny","day"]
    Explanation: "the", "is", "sunny" and "day" are the four most frequent words, with the number
    of occurrence being 4, 3, 2 and 1 respectively.
 */

public class TopKFrequentWords {
    public static void main(String[] args) {
        String[] words = {"the","day","is","sunny","the","the","the","sunny","is","is"};
        int k = 4;
        topKFrequent(words, k);
    }
    public static List<String> topKFrequent(String[] words, int k) {
        List<String> result = new ArrayList<>();
        Map<String, Integer> map = countWords(words);
        System.out.println(map);
        return result;
    }

    private static Map<String, Integer> countWords(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        for (int i=0; i<words.length; i++) {
            if (map.get(words[i])==null) {
                map.put(words[i], 1);
            } else {
                map.put(words[i], map.get(words[i])+1);
            }
        }
        return map;
    }
}
