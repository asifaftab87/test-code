package org.la.test.code.ps.pck.genr;

import java.util.Objects;

public class Flower {

    protected String name;
    protected String color;

    public Flower(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return Objects.equals(name, flower.name) &&
                Objects.equals(color, flower.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color);
    }
}
