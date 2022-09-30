package org.la.test.code.karumanchi.back.tracking;

import org.la.test.code.util.Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Combination {
    public static void main(String[] args) {
        Combination c = new Combination();
        List<List<Integer>> result = new ArrayList<>();
        Integer[] a = {1,2,3};
        c.backtrack(result, a, 0);
        System.out.println(result);
        System.out.println("count: "+count);
    }
    static int count = 0;
    void backtrack(List<List<Integer>> result, Integer[] nums, int start) {
        count++;
        if(start==nums.length) {
            result.add(Arrays.stream(nums).collect(Collectors.toList()));
        } else {
            for (int i=start ; i<nums.length ; i++) {
                Util.swap(nums, i, start);
                System.out.print("1: ");
                Util.print(nums);
                backtrack(result, nums, start+1);
                Util.swap(nums, i, start);
                System.out.print("2: ");
                Util.print(nums);
            }
        }
    }
}
