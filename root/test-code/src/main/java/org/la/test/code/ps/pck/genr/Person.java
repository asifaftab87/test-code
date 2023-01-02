package org.la.test.code.ps.pck.genr;

import java.util.Objects;

public class Person {

    private final String name;
    private final int age;

    public Person(String name, int age) {
        Objects.requireNonNull(name);
        this.name = name;
        this.age = age;
    }

    public int getAge() { return age; }

    public String getName() { return name; }

    @Override
    public boolean equals(Object that) {
        if (that==null || that.getClass() != getClass()) {
            return false;
        }
        Person person = (Person) that;
        return age == person.age && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        return  31 * result + age;
    }

    @Override
    public String toString() {
        return "{ name: " + name + ", age: " + age + " }";
    }
}
