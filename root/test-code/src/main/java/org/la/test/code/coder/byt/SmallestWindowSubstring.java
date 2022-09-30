package org.la.test.code.coder.byt;

import org.la.test.code.util.Util;

public class SmallestWindowSubstring {

    public static void main(String[] args) {
        String s = "this is a test string";
        String t = "tist";
//        findWindow(s, p);
        s = "ADOBECODEBANC";
        t = "ABC";
        String ans = minmWindow(s.toCharArray(), t.toCharArray());
        System.out.println(ans);
    }
    static String minmWindow(char[] s, char[] t){
        int[] m = new int[256];
        int ans = Integer.MAX_VALUE;
        int start = 0;
        int count = 0;
        for(int i=0 ; i<t.length ; i++) {
            if(m[t[i]]==0){
                count++;
            }
            m[t[i]]++;
        }
        //references of window
        int i = 0;
        int j = 0;
        while(j<s.length) {
            m[s[j]]--;              //ADOBECODEBANC
            if(m[s[j]]==0) {
                count--;
            }
            if(count==0){
                while (count==0) {
                    if(ans>j-i+1) {
                        ans = Math.min(ans, j-i+1);
                        start = i;
                    }
                    //sliding
                    m[s[i]]++;
                    if(m[s[i]]>0){
                        count++;
                    }
                    i++;
                }
            }
            j++;
        }
        if(ans!=Integer.MAX_VALUE)
            return String.valueOf(s).substring(start, start+ans);
        else
            return "-1";
    }
    static String findWindow(String s, String p) {
        int numOfChars = 256;
        int sl = s.length();
        int pl = p.length();
        int hashPat[] = new int[numOfChars];
        for (int i=0 ; i<pl ; i++) {
            hashPat[p.charAt(i)]++;
        }
        System.out.println(hashPat.length);
        Util.print(hashPat);
        return null;
    }

}
