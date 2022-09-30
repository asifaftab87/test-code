package org.la.test.code.immutable;

//Immutable dog class
public class Dog {
    private final String name;
    private final int weight;
    public Dog(String s, int i) {
        name = s;
        weight = i;
    }
    public String getName() {
        return name;
    }
    public int getWeight() {
        return weight;
    }
}
