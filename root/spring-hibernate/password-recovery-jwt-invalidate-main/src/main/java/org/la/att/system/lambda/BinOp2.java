package org.la.att.system.lambda;

import java.util.function.BinaryOperator;

public class BinOp2 {

    public static void main(String[] args) {

        BinaryOperator<Integer> bp = (a, b) -> a*b;
        int p = bp.apply(3, 5);
        System.out.println(p);
    }
}
