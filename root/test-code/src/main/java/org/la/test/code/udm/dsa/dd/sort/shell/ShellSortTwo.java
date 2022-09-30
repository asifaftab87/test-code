package org.la.test.code.udm.dsa.dd.sort.shell;

import org.la.test.code.util.Util;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ShellSortTwo {
    public static void main(String[] args) {
        System.out.println("ShellSortTwo");
        int a[] = {20, 35, -15, 7, 55, 1, -22};



        Util.print(Arrays.stream(a).boxed().collect(Collectors.toList()));
    }
}
