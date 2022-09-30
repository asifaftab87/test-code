package org.la.test.code.leetcode.permutation;

import java.util.ArrayList;
import java.util.List;

public class PermutationArrayElementsTwo {
    public static void main(String[] args) {
        PermutationArrayElementsTwo p = new PermutationArrayElementsTwo();
        List<List<Integer>> result = new ArrayList<>();
        int[] nums = {1,2,3};
        p.backtrack(result, nums, 0);
        for (List<Integer> l : result) {
            for (Integer i : l) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    void backtrack(List<List<Integer>> result, int[] nums, int start) {
        if(start==nums.length) {
            result.add(toList(nums));
        }
        else {
            for (int i = start; i<nums.length ; i++) {
                swap(i, start, nums);
                backtrack(result, nums, start+1);
                swap(i, start, nums);
            }
        }
    }
    List<Integer> toList(int[] a) {
        List<Integer> list = new ArrayList<>();
        for (int i : a) {
            list.add(i);
        }
        return list;
    }
    void swap(int i, int j, int[] a) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
