package org.la.test.code.ninja;

import java.util.HashMap;
import java.util.Map;

public class NumberPattern {

    public static void main(String[] args) {
        String[] arr = numberPattern(5);
        for (String s : arr)
            System.out.println(s);
    }

    public static String[] numberPattern(int n) {
        int val = 1;
        Map<Integer, String> map = new HashMap<>();
        for (int r=1; r<=n; r++) {
            StringBuilder sb = new StringBuilder();
            for (int c=0; c<n; c++) {
                sb.append(val++).append(" ");
            }
            map.put(r, sb.toString());
        }
        String[] sArr = new String[n];
        int ind = 0;
        for (int i=1; i<=n; i++) {
            if (i%2==1) {
                sArr[ind++] = map.get(i);
            }
        }
        for (int i=n; i>1; i--) {
            if (i%2==0) {
                sArr[ind++] = map.get(i);
            }
        }
        return sArr;
    }
}
