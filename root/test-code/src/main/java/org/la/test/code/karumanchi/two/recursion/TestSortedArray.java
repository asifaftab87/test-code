package org.la.test.code.karumanchi.two.recursion;
/** Given an array, check whether the array is in sorted order with recursion. */

public class TestSortedArray {
    private static boolean isArrayInSortedOrder(int[] a, int i) {
        if (a.length==1) {
            return true;
        }
        return i==0? true : (a[i]<a[i-1]) ? false : isArrayInSortedOrder(a, i-1);
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println("is array sorted: "+isArrayInSortedOrder(a, a.length-1));
    }
}
