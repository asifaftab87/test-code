package org.la.test.code.udm.dsa.dd.sort.quick;

import org.la.test.code.util.Util;

public class QuickSort {
    public static void main(String[] args) {
        int[] a = {20, 35, -15, 7, 55, 1, -22};
        quickSort(a, 0, a.length);
        Util.print(a);
    }
    static void quickSort(int[] a, int start, int end) {
         if(end-start<2) {
            return;
        }
        int p = partition(a, start, end);
        quickSort(a, start, p);
        quickSort(a, p+1, end);
    }
    static int partition(int[] a, int start, int end) {
        int pivot = a[start];
        int i=start, j=end;
        while(i<j) {
            while(i<j && a[--j]>=pivot);
            if(i<j) {
                a[i] = a[j];
            }

            while (i<j && a[++i]<=pivot);
            if(i<j) {
                a[j] = a[i];
            }
        }
        a[j] = pivot;
        return j;
    }
}
