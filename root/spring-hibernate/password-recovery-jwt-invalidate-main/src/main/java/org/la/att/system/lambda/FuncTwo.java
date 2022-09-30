package org.la.att.system.lambda;

import java.util.function.Function;

public class FuncTwo {
    public static void main(String[] args) {
        Function<String, Integer> func = y -> y.length();
        int l = func.apply("India");
        System.out.println(l);
    }
}
