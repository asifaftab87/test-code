package org.la.att.system.lambda;

import java.util.function.Function;

public class FuncOne {
    public static void main(String[] args) {
        Function<Integer, String> f = r -> "Hello world";
        String s = f.apply(4);
        System.out.println(s);
    }
}
