package org.la.test.code.ps.pck.genr;

import java.util.Objects;

public class Tulip extends Flower {

    public Tulip(String name, String color) {
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
//        if (this == that) {
//            return true;
//        }
//        if (that == null || getClass() != that.getClass()) {
//            return false;
//        }
//        Tulip tulip = (Tulip) that;
//        return Objects.equals(name, tulip.name) && Objects.equals(color, tulip.color);
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color);
    }
}
