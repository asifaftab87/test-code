package org.la.test.code.ps.pck.genr;

import java.util.Objects;

public class Rose extends Flower {

    public Rose(String name, String color) {
        super(name, color);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Flower flower = (Flower) o;
//        return Objects.equals(name, flower.name) &&
//                Objects.equals(color, flower.color);
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color);
    }
}
