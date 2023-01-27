package org.la.test.code.leetcode.problems;

import java.util.Arrays;

public class Candy {

    public static int candy(int[] ratings) {
        int len = ratings.length;
        int[] rightToLeft = new int[len];
        int[] leftToRight = new int[len];
        Arrays.fill(rightToLeft, 1);
        Arrays.fill(leftToRight, 1);
        for (int i=1; i<len; i++) {
            if (ratings[i] > ratings[i-1]) {
                leftToRight[i] = leftToRight[i-1] + 1;
            }
        }
        for (int i=len-2; i>=0; i--) {
            if (ratings[i] > ratings[i+1]) {
                rightToLeft[i] = rightToLeft[i+1] + 1;
            }
        }
        int s = 0;
        for (int i=0; i<len; i++) {
            s += Math.max(leftToRight[i], rightToLeft[i]);
        }
        return s;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1,0,2};
//        arr = new int[] {1,2,2};
//        arr = new int[]{1,3,2,2,1};
        arr = new int[]{1,2,87,87,87,2,1};
        System.out.println("res: "+candy(arr));
    }
}
