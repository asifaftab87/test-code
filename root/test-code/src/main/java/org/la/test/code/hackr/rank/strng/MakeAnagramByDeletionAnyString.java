package org.la.test.code.hackr.rank.strng;

public class MakeAnagramByDeletionAnyString {
    public static void main(String[] args) {
        String s1 = "asif";
        String s2 = "atif";
        int countDeleteChar = makeAnagram(s1, s2);
        System.out.println(countDeleteChar);
    }

    public static int makeAnagram(String a, String b) {
        int count = 0;
        int[] ar = new int[256];
        for (int i=0 ; i<a.length() ; i++) {
            ar[a.charAt(i)]++;
        }
        for (int i=0 ; i<b.length() ; i++) {
            ar[b.charAt(i)]--;
        }
        for (int i=0 ; i<256 ; i++) {
            count = count + Math.abs(ar[i]);
        }
        return count;
    }
}
