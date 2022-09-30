package org.la.test.code.leetcode.permutation;

import org.la.test.code.util.Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationArrayElements {
    public static void main(String[] args) {
        Integer[] a = {1,2,3};
        List<List<Integer>> res = new ArrayList<>();
        PermutationArrayElements p = new PermutationArrayElements();
        p.backtrack(a, res, 0);
        for (List<Integer> l : res) {
            for (Integer i : l) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    void backtrack(Integer[] a, List<List<Integer>> res, int s) {
        if(s == a.length) {
            res.add(Arrays.asList(a));
        }
        else {
            for (int i=s ; i<a.length ; i++) {
                Util.swap(a, s, i);
                backtrack(a, res, s+1);
                Util.swap(a, s, i);
            }
        }
    }

}
