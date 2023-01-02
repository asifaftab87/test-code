package org.la.test.code.ps.pck.genr;

import java.util.Objects;

public class Lilac extends Flower {

    public Lilac(String name, String color) {
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
    public boolean equals(Object that) {
        if (that == null || that.getClass() != getClass()) {
            return false;
        }
        if (this == that) {
            return true;
        }
        Lilac lilac = (Lilac) that;
        return lilac.name.equals(name) && lilac.color.equals(color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color);
    }
}
