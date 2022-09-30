package org.la.test.code.udm.dsa.dd.sort.selection;

import org.la.test.code.util.Util;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SelectionSort {
    public static void main(String[] args) {
        int a[] = new int[]{20, 35, -15, 7, 55, 1, -22};

        for(int unsorteListIndex=a.length-1 ; unsorteListIndex>0 ; unsorteListIndex--){
            int largest = 0;
            for(int i=1 ; i<=unsorteListIndex ; i++) {
                if(a[i]>a[largest])
                    largest = i;
            }
            swap(a, largest, unsorteListIndex);
        }
        Util.print(Arrays.stream(a).boxed().collect(Collectors.toList()));
    }
    static void swap(int[] a, int i, int j) {
        if(a[i]==a[j])
            return;
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
