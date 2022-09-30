package org.la.test.code.udm.dsa.dd.binar.search;

public class RecursiveBinarySearch {

    public static void main(String[] args) {
        int a[] = {-22, -15, 1, 7, 20, 35, 55};
        int res = recursiveBinarySearch(a, 55);
        System.out.println("result: "+res);
    }
    static int recursiveBinarySearch(int[] a, int v) {
        return recursiveBinarySearch(a, 0, a.length, v);
    }
    static int recursiveBinarySearch(int[] a, int start, int end, int v) {
        if(start>=end) {
            return -1;
        }
        int mid = (start+end)/2;
        if(a[mid]==v) {
            return mid;
        }
        if(a[mid]>v) {
            return recursiveBinarySearch(a, start, mid, v);
        } else {
            return recursiveBinarySearch(a, mid+1, end, v);
        }
    }
}
