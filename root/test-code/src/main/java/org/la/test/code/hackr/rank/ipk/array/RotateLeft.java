package org.la.test.code.hackr.rank.ipk.array;

import org.la.test.code.util.Util;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RotateLeft {
    public static void main(String[] args) {
        List<Integer> res = rotLeft(Arrays.asList(5,1,2,3,4), 100);
        Util.print(res);
    }
    public static List<Integer> rotLeft(List<Integer> a, int d) {
        int size = a.size();
        d = d % size;
        if(d==0) {
            return a;
        }
        int shift = -1;
        int[] arr = new int[size];
        for (int i=0 ; i<size ; i++) {
            if (size-d+i>=size) {
                shift = i - d;
            } else {
                shift = size + i - d;
            }
            arr[shift] = a.get(i);
        }
        return Arrays.stream(arr).boxed().collect(Collectors.toList());
    }
}
