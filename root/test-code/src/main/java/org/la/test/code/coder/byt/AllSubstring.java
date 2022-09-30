package org.la.test.code.coder.byt;

public class AllSubstring {
    public static void main(String[] args) {
        substring(args[0]);
    }
    static void substring(String s) {
        int l = s.length();
        for (int i=0 ; i<l ; i++) {
            for(int j=i+1 ; j<=l ; j++){
                System.out.println(s.substring(i, j));
            }
        }
    }
}
