package org.la.att.system.test;

public class One {

    public static void main(String[] args) {

        int d = 3;
        int c = d / ++d;
        System.out.println(c);
        System.out.println(d);
    }
}
