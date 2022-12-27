package org.la.test.code.amazon.hackerrank.demo;

import java.util.Arrays;
import java.util.List;

public class AudibleGroupCount {

    public static int countGroups(List<String> related) {
        System.out.println(related);
        int len = related.get(0).length();
        int[][] arr = new int[len][len];
        int sum = 0;
        for (int r=0 ; r<related.size() ; r++) {
            String[] a = related.get(r).split("");
            createArray(arr, a, r);
        }
        for(int r=0 ; r<len ; r++) {
            for(int c=0 ; c<len ; c++) {
                if (r!=c && arr[r][c]==1) {
                    sum++;
                }
            }
        }
        return sum;
    }
    static void createArray(int[][] iArr, String[] a, int r) {
        for(int c=0 ; c<a.length ; c++) {
            iArr[r][c] = Integer.valueOf(a[c]);
        }
    }
    public static void main(String[] args) {
        List<String> list = Arrays.asList("110", "110", "001");
        int res = countGroups(list);
        System.out.println(res);
    }
}
