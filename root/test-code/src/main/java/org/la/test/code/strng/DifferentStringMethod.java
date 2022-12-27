package org.la.test.code.strng;

public class DifferentStringMethod {
    static String s;
    static boolean startsWithCustom(String prefix) {
        return s.startsWith(prefix);
    }

    public static void main(String[] args) {
        s = "Hello World";
        String p = "Hel";
        boolean res = startsWithCustom(p);
        System.out.println(res);
    }
}
