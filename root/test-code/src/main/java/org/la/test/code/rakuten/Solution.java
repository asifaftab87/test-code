package org.la.test.code.rakuten;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public int solution(int[] a, int k, int l){
        int max = -1;
        int len = a.length;
        if(len<(k+l)){
            return max;
        }
        List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> sumList = new ArrayList<>();
        for(int i=0 ; i+k<=len ; i++){
            findSum(list, sumList, k, l, i, len);
        }
        max = sumList.stream().max(Integer::compareTo).get();
        System.out.println(sumList);
        return max;
    }

    private void findSum(List<Integer> list, List<Integer> sumList, int k, int l, int reserve, int len){
        List<Integer> one = list.subList(reserve, reserve+k);
        for(int i=0 ; i+l<=len ; i++){
            if(!(i>=reserve && i<reserve+k)){
                List<Integer> two = list.subList(i, i+l);
                sumList.add(two.stream().reduce(0, Integer::sum) + one.stream().reduce(0, Integer::sum));
            }
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] a = {1,2,3,4,5,6,7,8,9,10, 11,12, 13,14, 15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
        a = new int[]{6,1,4,6,3,2,7,4};
//        int res = sol.solution(a, 6, 7);
        int res = sol.solution(a, 3, 2);
        System.out.println(res);
    }

}
