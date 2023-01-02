package org.la.test.code.ps.pck.genr;

import java.util.Arrays;

public class TheArrayProblem {

    public static void main(String[] args) {
        Person donDraper = new Person("Don Drapper", 89);
        Person peggyOlson = new Person("Peggy Olson", 65);
        Person[] madMen = { donDraper, peggyOlson };
        madMen = add(new Person("Bert Cooper", 100), madMen);
        System.out.println(Arrays.toString(madMen));
    }

    private static Person[] add(final Person person, Person[] array) {
        final int len = array.length;
        array = Arrays.copyOf(array, len + 1);
        array[len] = person;
        return array;
    }
}
