package org.la.test.code.udm.dsa.dd.sort.insertion;

import org.la.test.code.util.Util;

import java.util.Arrays;
import java.util.stream.Collectors;

public class InsertionSortTwo {
    public static void main(String[] args) {
        System.out.println("InsertionSortTwo");
        int a[] = {20, 35, -15, 7, 55, 1, -22};

        for (int sortedFirstIndex=1 ; sortedFirstIndex<a.length ; sortedFirstIndex++) {
            int el = a[sortedFirstIndex];
            int i = sortedFirstIndex;
            while(i>0 && a[i-1]>el) {
                a[i] = a[i-1];
            }
            a[i] = el;
        }

        Util.print(Arrays.stream(a).boxed().collect(Collectors.toList()));
    }
}
