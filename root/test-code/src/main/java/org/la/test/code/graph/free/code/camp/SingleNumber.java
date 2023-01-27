package org.la.test.code.graph.free.code.camp;

/*
    url:    https://leetcode.com/problems/single-number/submissions/876940861/
    All elements in array arr are repeating 2 times except one element.
    Please return that single element
 */
public class SingleNumber {

    public static int singleNumber(int[] arr) {
        int r = 0;
        for (int i: arr) {
            r = r ^ i;
        }
        return r;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {2,2,1,3,4,1,3,7,4};
        System.out.println("result: "+singleNumber(arr));
    }
}
