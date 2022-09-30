package org.la.test.code.hackr.rank.easy.warmup;

public class RepeatedString {
    public static void main(String[] args) {
//        long res = repeatedString("abcac", 10);
        long res = repeatedString("d", 590826798023l);
        System.out.println(res);
    }

    public static long repeatedString(String s, long n) {
        if(s.length()==1 && s.charAt(0)=='a') {
            return n;
        }
        long len = s.length();
        long quotient = n / len;
        int remainder = (int)(n % len);
        long ca = count(s, 'a') * quotient;
        String ss = s.substring(0, remainder);
        ca = ca + count(ss, 'a');
        return ca;
    }
    private static int count(String s, char a) {
        int count = 0;
        for (int i=0 ; i<s.length() ; i++) {
            if(s.charAt(i)==a) {
                count++;
            }
        }
        return count;
    }
}
