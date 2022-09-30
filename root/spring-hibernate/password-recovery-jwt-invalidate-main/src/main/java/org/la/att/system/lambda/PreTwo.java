package org.la.att.system.lambda;

import java.util.function.Predicate;

public class PreTwo {
    public static void main(String[] args) {
        Predicate<Integer> p = a -> a==0;
        boolean a = p.test(4);
        System.out.println("b: "+a);
    }
}
