package org.la.test.code.udm.dsa.dd.binar.search;

/*
    For binary search the list should be in sorted order
 */
public class BinarySearch {
    public static void main(String[] args) {
        int a[] = {-22, -15, 1, 7, 20, 35, 55};
        int res = iterateBinarySearch(a, 7);
        System.out.println("result: "+res);
    }
    static int iterateBinarySearch(int[] a, int v) {
        int start = 0, end = a.length;
        while(start<end) {
            int mid = (start + end) / 2;
            if(a[mid]==v) {
                return mid;
            } else if(a[mid]<v) {
                start = mid+1;
            } else {
                end = mid;
            }
        }
        return -1;
    }
}
