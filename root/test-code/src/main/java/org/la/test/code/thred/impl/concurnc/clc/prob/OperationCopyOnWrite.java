package org.la.test.code.thred.impl.concurnc.clc.prob;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class OperationCopyOnWrite {

    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("Squirrel");
        list.add("Mouse");
        list.add("Hamster");
        for (String s : list) {
            System.out.println(s);

            // On modification it will create new list and will modify that new list
            // Old list will remain same, for performance wise it is very bad, as it is creating new list
            // for every modification
            list.add(s);
        }
        System.out.println(list);

        Set<String> set = new CopyOnWriteArraySet<>();
        set.add("Dog");
        set.add("Cat");
        set.add("Horse");
        for (String s : set) {
            System.out.println(s);
            set.add(s);
        }
        System.out.println(set);
    }
}
