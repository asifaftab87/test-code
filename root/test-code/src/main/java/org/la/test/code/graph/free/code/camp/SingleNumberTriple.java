package org.la.test.code.graph.free.code.camp;

import java.util.HashMap;
import java.util.Map;

/*
    url: https://leetcode.com/problems/single-number-ii/submissions/877321385/
    All elements in array arr are repeating 3 times except one element.
    Please return that single element
 */
public class SingleNumberTriple {

    public static int singleNumber(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i: arr) {
            if (map.get(i) == null) {
                map.put(i, 1);
            } else {
                int v = map.get(i);
                if (v == 2) {
                    map.remove(i);
                    continue;
                }
                map.put(i, v + 1);
            }
        }
        return map.keySet().iterator().next();
    }

    public static void main(String[] args) {
        int[] arr = new int[] {2,2,1,3,4,1,3,7,4,2,1,3,4};
        System.out.println("result: "+singleNumber(arr));
    }
}
