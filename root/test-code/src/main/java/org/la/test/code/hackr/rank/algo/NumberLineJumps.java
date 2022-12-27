package org.la.test.code.hackr.rank.algo;

public class NumberLineJumps {

    public static String kangaroo(int x1, int v1, int x2, int v2) {

        int distanceDiff = x2 - x1;
        int velocityDiff = v1 - v2;
        if (v2<v1 && distanceDiff % velocityDiff == 0) {
            return "YES";
        }
        return "NO";
    }

    // Driver Code
    public static void main(String[] args) {
        int x1 = 2, v1 = 20, x2 = 19, v2 = 9;
//        A=4;
//        C=5;
//        B=3;
//        D=2;
        x1 = 45;
        v1 = 7;
        x2 = 56;
        v2 = 2;
        System.out.println(kangaroo(x1, v1, x2, v2));
    }
}
