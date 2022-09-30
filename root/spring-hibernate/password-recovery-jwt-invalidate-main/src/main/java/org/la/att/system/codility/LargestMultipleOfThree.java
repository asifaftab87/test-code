package org.la.att.system.codility;

import java.util.Arrays;

public class LargestMultipleOfThree {
    public int solution(int[] a){
        Arrays.sort(a);
        print(a);
        return largestMultiple(a);
    }
    public int largestMultiple(int[] a){
        for(int i=a.length-1 ; i>=0 ; i--){
            if(a[i]%3==0){
                return a[i];
            }
        }
        return -1;
    }
    public void print(int[] a){
        for(int i : a)
            System.out.print(i+" ");
    }
    public static void main(String[] args) {
//        int[] a = {131,232,53,-342,-33,332,903,989,333,-2,893,89393,10000,13123};
        int[] a = {131,232,53,-342,-33,332,904,989,333,-2,893,89393,10000,13123};
        LargestMultipleOfThree largestMultipleOfThree = new LargestMultipleOfThree();
        int res = largestMultipleOfThree.solution(a);
        System.out.println("\nres: "+res);
    }
}
