package org.la.test.code.hackr.rank.ipk.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayManipulation {
    public static void main(String[] args) {
        List<List<Integer>> listList = new ArrayList<>();
        List<Integer> list = Arrays.asList(1,5,3);
        listList.add(list);
        list = Arrays.asList(4,8,7);
        listList.add(list);
        list = Arrays.asList(6,9,1);
        listList.add(list);

        long ans = arrayManipulation(10, listList);
        System.out.println(ans);
    }

    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        long max = Long.MIN_VALUE;
        long[] arr = new long[n+1];
        int row = queries.size();
        for (int r=0 ; r<row ; r++) {
            int a = queries.get(r).get(0);
            int b = queries.get(r).get(1);
            int k = queries.get(r).get(2);
            arr[a-1] = arr[a-1] + k;
            arr[b] = arr[b] - k;
        }
        long sum = 0;
        for (long ar : arr) {
            sum += ar;
            if (sum>max) {
                max = sum;
            }
        }
        return max;
    }
    /*
        working but not efficient
        hacker rank throwing runtime exception and also taking more space
     */
    public static long arrayManipulation3(int n, List<List<Integer>> queries) {
        long max = Long.MIN_VALUE;
        int col = n;
        int row = queries.size();
        int[][] a2 = new int[row+1][col];
        for (int r=1 ; r<=row ; r++) {
            int a = queries.get(r-1).get(0);
            int b = queries.get(r-1).get(1);
            int k = queries.get(r-1).get(2);
            a2[r] = Arrays.copyOfRange(a2[r-1], 0, col);
            for (int c=a-1 ; c<=b-1 ; c++) {
                a2[r][c] = a2[r][c] + k;
                if (a2[r][c]>max) {
                    max = a2[r][c];
                }
            }
        }
        //print(a2);
        //System.out.println(queries.size());
        return max;
    }

    public static long arrayManipulation2(int n, List<List<Integer>> queries) {
        long max = Long.MIN_VALUE;
        int col = n;
        int row = queries.size();
        int[][] a2 = new int[row+1][col];
        for (int r=1 ; r<=row ; r++) {
            int a = queries.get(r-1).get(0);
            int b = queries.get(r-1).get(1);
            int k = queries.get(r-1).get(2);
            for (int c=0 ; c<col ; c++) {
                int s = 0;
                if(c>=a-1 && c<=b-1) {
                    s = k;
                }
                a2[r][c] = a2[r-1][c] + s;
                if (a2[r][c]>max) {
                    max = a2[r][c];
                }
            }
        }
        //print(a2);
        //System.out.println(queries.size());
        return max;
    }

    static void print(int[][] a){
        for (int i=0 ; i<a.length ; i++) {
            for (int j=0 ; j<a[i].length ; j++) {
                System.out.print("a["+i+"]["+j+"] = "+a[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
