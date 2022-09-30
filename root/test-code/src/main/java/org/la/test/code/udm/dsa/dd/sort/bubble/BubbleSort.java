package org.la.test.code.udm.dsa.dd.sort.bubble;

import org.la.test.code.util.Util;

import java.util.Arrays;
import java.util.stream.Collectors;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {20, 35, -15, 7, 55, 1, -22};
        for(int lastUnsortedIndex = arr.length-1 ; lastUnsortedIndex>0 ; lastUnsortedIndex--) {
            for(int i=0 ; i<lastUnsortedIndex ; i++) {
                if(arr[i]>arr[i+1]) {
                    swap(arr, i, i+1);
                }
            }
        }
        Util.print(Arrays.asList(Arrays.stream(arr).boxed().collect(Collectors.toList())));
    }
    static void swap(int[] a, int i, int j) {
        if(a[i]==a[j])
            return;
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
