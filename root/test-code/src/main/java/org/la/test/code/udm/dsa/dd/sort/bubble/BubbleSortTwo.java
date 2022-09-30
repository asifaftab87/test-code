package org.la.test.code.udm.dsa.dd.sort.bubble;

import org.la.test.code.util.Util;

import java.util.Arrays;
import java.util.stream.Collectors;

public class BubbleSortTwo {
    public static void main(String[] args) {
        System.out.println("BubbleSortTwo");
        int a[] = new int[]{20, 35, -15, 7, 55, 1, -22};



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
