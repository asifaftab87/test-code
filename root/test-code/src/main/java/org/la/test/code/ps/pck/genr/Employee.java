package org.la.test.code.ps.pck.genr;

public class Employee extends Person {

    public Employee(final String name, final int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Partner{" +
                "name='" + getName() +'\'' +
                "age='" + getAge() +
                '}';
    }
}
