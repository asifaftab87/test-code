package org.la.test.code.hackr.rank.easy.warmup;

import java.util.Arrays;
import java.util.List;

public class JumpingOnClouds {
    public static void main(String[] args) {
//        int res = jumpingOnClouds(Arrays.asList(0,1,0,0,1,0));
//        int res = jumpingOnClouds(Arrays.asList(0,0,1,0,0,1,0));
//        int res = jumpingOnClouds(Arrays.asList(0,0,0,0,1,0));
//        int res = jumpingOnClouds(Arrays.asList(0, 0, 0, 1, 0, 0)); //3
//        int res = jumpingOnClouds(Arrays.asList(0,1,0));
        int res = jumpingOnClouds(Arrays.asList(0,0,0));
        System.out.println(res);
    }

    public static int jumpingOnClouds(List<Integer> c) {
        int jump = 0;
        int size = c.size();
        for (int i = 0; i < size - 1; i++, jump++) {
            if (i+2<c.size() && c.get(i + 2) == 0) {
                i++;
            }
        }
        return jump;
    }
}
