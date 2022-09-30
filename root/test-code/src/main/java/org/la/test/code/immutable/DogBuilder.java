package org.la.test.code.immutable;

//builder pattern
public class DogBuilder {
    private String name;
    private int weight;

    public DogBuilder(){}

    public Dog build() {
        return new Dog(name, weight);
    }

    public  DogBuilder setName(String n) {
        name = n;
        return this;
    }
    public DogBuilder setWeight(int w) {
        weight = w;
        return this;
    }

    public String getName() {
        return name;
    }
    public int getWeight() {
        return weight;
    }
}
