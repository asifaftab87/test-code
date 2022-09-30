package org.la.test.code.strng;

public class ReplaceCharacterFoundAnotherString {
    public static void main(String[] args) {
        String token = "23na8dkf";
        String src = "sannas";
        char[] a = token.toCharArray();
        for (int i=0 ; i<a.length ; i++) {
            if(src.contains(a[i]+"")){
                src = src.replace(a[i]+"", "--"+a[i]+"--");
            }
        }
        System.out.println(src);
    }
}
