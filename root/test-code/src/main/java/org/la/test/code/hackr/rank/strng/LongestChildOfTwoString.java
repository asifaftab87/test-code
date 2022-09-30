package org.la.test.code.hackr.rank.strng;

/*
    it is commonly known as
    Longest Common Sequence
 */
public class LongestChildOfTwoString {

    public static void main(String[] args) {
        int res = commonChild("SHINCHAN", "NOHARAAA");
        System.out.println(res);
    }

    public static int commonChild(String a, String b) {
        int la = a.length();
        int lb = b.length();
        int[][] lcs = new int[la+1][lb+1];

        for (int r=1 ; r<=la ; r++) {
            for (int c=1 ; c<=lb ; c++) {
                if (a.charAt(r-1)==b.charAt(c-1)) {
                    lcs[r][c] = lcs[r-1][c-1] + 1;
                } else {
                    lcs[r][c] = Math.max(lcs[r-1][c], lcs[r][c-1]);
                }
            }
        }
        return lcs[la][lb];
    }
}
