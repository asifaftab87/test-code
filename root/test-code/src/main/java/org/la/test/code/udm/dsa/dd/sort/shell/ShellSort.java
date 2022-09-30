package org.la.test.code.udm.dsa.dd.sort.shell;

import org.la.test.code.util.Util;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ShellSort {
    public static void main(String[] args) {
        System.out.println("ShellSort");
        int a[] = {20, 35, -15, 7, 55, 1, -22};

        for (int gap=a.length/2 ; gap>0 ; gap=gap/2) {
            for (int i=gap ; i<a.length ; i++) {
                int el = a[i];
                int j = i;
                while (j>0 && a[j-gap]>el) {
                    a[j] = a[j-gap];
                    j = j - gap;
                }
                a[j] = el;
            }
        }
        System.out.println("end");
        Util.print(Arrays.stream(a).boxed().collect(Collectors.toList()));
    }
}
