package org.la.test.code.hackr.rank.ipk.array;

import java.util.Arrays;
import java.util.List;

public class MinimumBribes {
    public static void main(String[] args) {
//        minimumBribes(Arrays.asList(1,2,3,5,4,6,7,8));
//        minimumBribes(Arrays.asList(4,1,2,3));
//        minimumBribes(Arrays.asList(2,1,5,3,4));
//        minimumBribes(Arrays.asList(2,5,1,3,4));
        minimumBribes(Arrays.asList(1,2,5,3,7,8,6,4));
    }
    public static void minimumBribes(List<Integer> q) {
        int bribes = 0;
        int i = 0;
        for (Integer o : q) {
            int cur = i + 1;
            if (o-cur>2) {
                System.out.println("Too chaotic");
                return;
            }
            int start = Math.max(o-2, 0);
            for (int x=start ; x<i ; x++) {
                int k = q.get(x);
                if (k>o) {
                    bribes += 1;
                }
            }
            i++;
        }
        System.out.println(bribes);
    }
    public static void minimumBribes2(List<Integer> q) {
        int swap = 0;
        int bribes;
        int pos = 0;
        for(int i = q.size()-1; i >= 0; i--) {
            int j = 0;
            bribes = q.get(pos) - (pos++);
            if (bribes > 2) {
                System.out.println("Too chaotic");
                return;
            }
            if (q.get(i) - 2 > 0){
                j = q.get(i) - 2;
            }

            while(j <= i) {
                if (q.get(j) > q.get(i)){
                    swap++;
                }
                j++;
            }
            pos++;
        }
        System.out.println(swap);
    }
}
