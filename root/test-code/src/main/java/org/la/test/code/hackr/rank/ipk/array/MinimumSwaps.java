package org.la.test.code.hackr.rank.ipk.array;

import org.la.test.code.util.Util;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
    You are given an unordered array consisting of consecutive integers  [1, 2, 3, ..., n]
    without any duplicates. You are allowed to swap any two elements. Find the minimum number
    of swaps required to sort the array in ascending order.
 */
public class MinimumSwaps {
    public static void main(String[] args) {
        int[] arr = new int[]{7,1,3,2,4,5,6};
        int res = minimumSwaps(arr);
        System.out.println(res);
        Util.print(arr);
    }

    static int minimumSwaps(int[] a) {
        int len = a.length, r = 0;
        int[] t = Arrays.copyOfRange(a, 0, len);
        //Correct value with location
        Arrays.sort(t);

        /*
            I will save key as array value as location in order to access value using location without
            iteration, just directly by key
            as key is value of array and location as value
         */
        Map<Integer, Integer> h = new HashMap<>();
        //storing value as key and value as location
        for (int i=0 ; i<len ; i++) {
            h.put(a[i], i);
        }

        for (int i=0 ; i<len ; i++) {
            if (a[i]!=t[i]) {
                r++;
                int k = a[i];
                swap(a, i, h.get(t[i]));
                h.put(k, h.get(t[i]));
                h.put(t[i], i);
            }
        }
        return r;
    }

    static int minimumSwaps3(int[] arr) {
        int cnt = 0;
        for (int unsortedListIndex=0 ; unsortedListIndex<arr.length ; unsortedListIndex++) {
            if(arr[unsortedListIndex]!=unsortedListIndex+1) {
                int smallest = unsortedListIndex;
                for (int i = unsortedListIndex + 1; i < arr.length; i++) {
                    if (arr[i] < arr[smallest]) {
                        smallest = i;
                    }
                }
                boolean b = swap(arr, smallest, unsortedListIndex);
                if (b) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    static int minimumSwaps2(int[] arr) {
        int cnt = 0;
        for (int unsortedListIndex=arr.length-1 ; unsortedListIndex>0 ; unsortedListIndex--) {
            int largest = 0;
            for (int i=1 ; i<=unsortedListIndex ; i++) {
                if(arr[i]>arr[largest]) {
                    largest = i;
                }
            }
            boolean b = swap(arr, largest, unsortedListIndex);
            if (b) {
                cnt++;
            }
        }
        return cnt;
    }
    static boolean swap(int[] a, int i, int j) {
        if (a[i]==a[j]) {
            return false;
        }
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
        return true;
    }
}
