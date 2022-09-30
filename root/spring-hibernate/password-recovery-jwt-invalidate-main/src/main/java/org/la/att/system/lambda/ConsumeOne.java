package org.la.att.system.lambda;

import java.util.function.Consumer;

public class ConsumeOne {
    public static void main(String[] args) {
        Consumer<Integer> c = a -> System.out.println(a);
        c.accept(4);
    }
}
