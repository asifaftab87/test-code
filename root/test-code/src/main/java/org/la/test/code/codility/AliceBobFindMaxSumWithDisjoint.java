package org.la.test.code.codility;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

public class AliceBobFindMaxSumWithDisjoint {
    public int solution(int[] a, int k, int l) {
        if(a.length<(k+l))
            return -1;
        int ans = -1;
        int len = a.length;
        int max = -1;
        List<Integer> list = new ArrayList<>();
        for(int i=0 ; i<=len-k ; i++) {
            int sumK = sumOfArrayElement(a, i, k+i);
            int sumL = sumOfAllCombination(a, k+i, l, len, i);
            list.add(sumK+sumL);
            System.out.println(list);
        }
        max = list.stream().mapToInt(v -> v).max().getAsInt();
        return max;
    }
    //start included, end not included
    //will return max value from list
    private int sumOfAllCombination(int[] a, int start, int l, int len, int currentLocation) {
        List<Integer> list = new ArrayList<>();
        for(int i=0 ; i<=len-l ; i++) {
            if((currentLocation-(l+i))>=0) {
                list.add(sumOfArrayElement(a, i, l));
            }
            else {
                list.add(sumOfArrayElement(a, start+i, start+i + l));
            }
        }
        OptionalInt max = list.stream().mapToInt(v -> v).max();
        return max.getAsInt();
    }

    //start included, end not included
    private int sumOfArrayElement(int[] a, int start, int end) {
        int sum = 0;
        for(int i=start ; i<a.length && i<end ; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        AliceBobFindMaxSumWithDisjoint obj = new AliceBobFindMaxSumWithDisjoint();
        int[] a = {1,1,3,4,4,4};
        a = new int[]{6,1,4,6,3,2,7,4};
        a = new int[]{10,19,15};
        System.out.println(obj.solution(a, 2, 2));
    }
}
