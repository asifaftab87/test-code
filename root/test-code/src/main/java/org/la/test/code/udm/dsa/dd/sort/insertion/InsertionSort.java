package org.la.test.code.udm.dsa.dd.sort.insertion;

import org.la.test.code.util.Util;

import java.util.Arrays;
import java.util.stream.Collectors;

public class InsertionSort {

    public static void main(String[] args) {
        int a[] = {20, 35, -15, 7, 55, 1, -22};

        for(int firstUnsortedIndex=1 ; firstUnsortedIndex<a.length ; firstUnsortedIndex++) {
            int newElement = a[firstUnsortedIndex];
            int i;
            for( i=firstUnsortedIndex ; i>0 && a[i-1]>newElement ; i--) {
                a[i] = a[i-1];
            }
            a[i] = newElement;
        }
        Util.print(Arrays.stream(a).boxed().collect(Collectors.toList()));
    }
}
