package org.la.test.code.hackr.rank.strng;

public class AllAnagramCount {
    public static void main(String[] args) {
//        int res = substrCount(10, "cdefghijkl");
//        int res = substrCount(8, "mnonopoo");
        int res = substrCount(7, "abcbaba");
        System.out.println(res);
    }
    public static int substrCount(int n, String s) {
        int result = 0;
        int len = s.length();
        int[] freq = new int[len];
        int i = 0;
        while (i<n) {
            int sameCharCount = 1;
            int j = i+1;
            while(j<n && s.charAt(i)==s.charAt(j)) {
                sameCharCount++;
                j++;
            }
            result += sameCharCount*(sameCharCount+1)/2;
            freq[i] = sameCharCount;
            i = j;
        }
        for(int j=1 ; j<len ; j++) {
            if(s.charAt(j)==s.charAt(j-1)) {
                freq[j] = freq[j-1];
            }
            if(j<(len-1) && s.charAt(j-1)==s.charAt(j+1) && s.charAt(j)!=s.charAt(j-1)) {
                result += Math.min(freq[j-1], freq[j+1]);
            }
        }
        return result-len;
    }
}
