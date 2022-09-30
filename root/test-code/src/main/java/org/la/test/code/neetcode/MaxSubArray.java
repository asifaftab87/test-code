package org.la.test.code.neetcode;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] a = {-2,1,-3,4,-1,2,1,-5,4};
        int sum = 0;
        int max = a[0];
        for (int i=0 ; i<a.length ; i++) {
            if(sum<0) {
                sum = 0;
            }
            sum += a[i];
            max = Math.max(max, sum);
        }
        System.out.println("Max: "+max);
    }
}
