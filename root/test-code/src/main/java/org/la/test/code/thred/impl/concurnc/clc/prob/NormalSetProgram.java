package org.la.test.code.thred.impl.concurnc.clc.prob;

import java.util.HashSet;
import java.util.Set;

public class NormalSetProgram {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Tim");
        set.add("Pascal");
        set.add("Elias");
        set.forEach(System.out::println);
    }
}
