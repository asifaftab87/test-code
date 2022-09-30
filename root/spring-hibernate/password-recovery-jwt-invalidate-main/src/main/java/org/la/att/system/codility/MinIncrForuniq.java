package org.la.att.system.codility;

import java.util.HashSet;
import java.util.TreeMap;

public class MinIncrForuniq {
    public static void main(String[] args) {
        int cur = Math.max(3+1, 7);
        int[] a = {1,2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 1, 2, 3, 4, 5, 6, 7};
        minIncrementForUnique(a);
    }

    static int minIncrementForUnique(int[] a){
        TreeMap<Integer, Integer> dict = new TreeMap<>();
        HashSet<Integer> used = new HashSet<>();
        for(int i : a){
            if(dict.containsKey(i)){
                dict.put(i, dict.get(i)+1);
            } else {
                dict.put(i, 1);
                used.add(i);
            }
        }
        p(dict);
        p(used);
        int maxUsed = 0;
        int ans = 0;


        return -1;
    }
    static void p(Object o){
        System.out.println(o);
    }
}
