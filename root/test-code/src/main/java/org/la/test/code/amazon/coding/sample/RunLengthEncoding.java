package org.la.test.code.amazon.coding.sample;

public class RunLengthEncoding {

    public static String compress(String src) {
        StringBuilder sb = new StringBuilder();
        int len = src.length();
        for (int i=0 ; i<len ;) {
            char base = src.charAt(i);
            int j = i+1;
            int count = 1;
            while (j<len && base==src.charAt(j)) {
                count++;
                j++;
            }
            i = j;
            sb.append(count).append(base);
        }
        return sb.toString();
    }

    public static String compress2(String src) {
        StringBuilder sb = new StringBuilder();
        int len = src.length();
        char prevChar = 0;
        int count = 0;
        for (int i=0 ; i<len ; i++) {
            char ch = src.charAt(i);
            if(ch==prevChar) {
                count++;
            }
            else {
                if(prevChar!=0) {
                    sb.append(count).append(prevChar);
                }
                prevChar = ch;
                count = 1;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String src = "aaaabbbccd";
        src = "aaaabbbccdabcd";
//        String trgt = compress(src);
        String trgt = compress2(src);
        System.out.println("trgt: "+trgt);
    }
}
