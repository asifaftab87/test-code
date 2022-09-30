package org.la.test.code.hackr.rank.easy.warmup;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SocksPairCount {
    public static void main(String[] args) {
        int res = sockMerchant(7, Arrays.asList(1,2,1,2,1,3,2));
        System.out.println(res);
    }
    public static int sockMerchant(int n, List<Integer> ar) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer key : ar) {
            Integer val = map.get(key);
            if(val==null) {
                map.put(key, 1);
            } else {
                map.put(key, val+1);
            }
        }
        int numOfPairs = 0;
        for (Map.Entry<Integer, Integer> keyVal : map.entrySet()) {
            numOfPairs += keyVal.getValue()/2;
        }
        return numOfPairs;
    }
}
