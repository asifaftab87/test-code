package org.la.test.code.hackr.rank.twod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
An hourglass in  is a subset of values with indices falling in this pattern in 's graphical representation:

a b c
  d
e f g
There are  hourglasses in . An hourglass sum is the sum of an hourglass' values. Calculate the hourglass sum for every hourglass in , then print the maximum hourglass sum. The array will always be .

Example


-9 -9 -9  1 1 1
 0 -9  0  4 3 2
-9 -9 -9  1 2 3
 0  0  8  6 6 0
 0  0  0 -2 0 0
 0  0  1  2 4 0
The  hourglass sums are:

-63, -34, -9, 12,
-10,   0, 28, 23,
-27, -11, -2, 10,
  9,  17, 25, 18
The highest hourglass sum is  from the hourglass beginning at row , column :

0 4 3
  1
8 6 6
 */
public class HourGlass {

    static int hourGlass(int[][] aa) {
        int largest = Integer.MIN_VALUE;

        for(int row=0 ; row<4 ; row++) {
            for (int col=0 ; col<4 ; col++) {

                int sum = 0;
                int secondCol = 0;
                for(int r=row ; r<=row+2 ; r++) {
                    secondCol++;
                    if(secondCol==2) {
                        sum += aa[r][col+1];
                    } else {
                        for (int c = col; c <= col+2; c++) {
                            sum += aa[r][c];
                        }
                    }
                }
                if(largest<sum) {
                    largest = sum;
                }
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        List<List<Integer>> ll = new ArrayList<>();
        List<Integer> l = null;
//        l = Arrays.asList(-9, -9, -9, 1, 1, 1);
//        ll.add(l);
//        l = Arrays.asList(0, -9,  0,  4, 3, 2);
//        ll.add(l);
//        l = Arrays.asList(-9, -9, -9, 1, 2, 3);
//        ll.add(l);
//        l = Arrays.asList(0, 0, 8, 6, 6, 0);
//        ll.add(l);
//        l = Arrays.asList(0, 0, 0, -2, 0, 0);
//        ll.add(l);
//        l = Arrays.asList(0, 0, 1, 2, 4, 0);
//        ll.add(l);
        l = Arrays.asList(1, 1, 1, 0, 0, 0);
        ll.add(l);
        l = Arrays.asList(0, 1, 0, 0, 0, 0);
        ll.add(l);
        l = Arrays.asList(1, 1, 1, 0, 0, 0);
        ll.add(l);
        l = Arrays.asList(0, 0, 2, 4, 4, 0);
        ll.add(l);
        l = Arrays.asList(0, 0, 0, 2, 0, 0);
        ll.add(l);
        l = Arrays.asList(0, 0, 1, 2, 4, 0);
        ll.add(l);

        int[][] aa = buildArray(ll);

        int res = hourGlass(aa);
//        print(aa);
        System.out.println("hourglass: "+res);
    }
    static int[][] buildArray(List<List<Integer>> ll){
        int[][] aa = new int[6][6];
        for(int r=0 ; r<6 ; r++) {
            List<Integer> l = ll.get(r);
            for(int c=0 ; c<6 ; c++) {
                aa[r][c] = l.get(c);
            }
        }
        return aa;
    }
    static void print(int[][] aa) {
        for(int r=0 ; r<aa.length ; r++) {
            for (int c=0 ; c<aa[r].length ; c++) {
                System.out.print(aa[r][c]+" ");
            }
            System.out.println();
        }
    }
}
