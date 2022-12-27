package org.la.test.code.generic;

import java.util.ArrayList;
import java.util.List;

public class CopyList {

    public static void main(String[] args) {


//        List<Number> li = IntStream.range(1, 11).boxed().collect(Collectors.toList());
        List<Number> ld = new ArrayList<>();
//        copy(li, ld);
//        ld.forEach(System.out::println);
    }

    public static void copy(List<? extends GrandParent> src, List<? super Child> trgt) {
        Object object = trgt.get(0);
        GrandParent grandParent = src.get(0);
//        src.forEach(trgt::add);
    }

//    public static void copy(List<? extends Number> src, List<? super Number> trgt) {
//        src.forEach(trgt::add);
//    }
}

abstract class GrandParent {
    protected String name;
    abstract void setName(String name);
    abstract String getName();
    protected void message() {
        System.out.println("I am grand parent: "+name);
    }
}

class Parent extends GrandParent {

    @Override
    void setName(String name) {
        this.name = name;
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    public void message() {
        System.out.println("I am parent: "+name);
    }
}

class Child extends Parent {

    @Override
    public void message() {
        System.out.println("I am child: "+name);
    }
}

class Student {

    private int roll;
    private String name;

    public Student(){}

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
}