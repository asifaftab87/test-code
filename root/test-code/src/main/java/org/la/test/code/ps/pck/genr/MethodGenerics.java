package org.la.test.code.ps.pck.genr;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MethodGenerics {

    public static void main(String[] args) {
        Person donDraper = new Person("Don Draper", 89);
        Person peggyOlson = new Person("Peggy Olson", 65);
        Person bertCooper = new Person("Bert Cooper", 100);
        List<Person> madMen = new ArrayList<>();
        madMen.add(donDraper);
        madMen.add(peggyOlson);
        madMen.add(bertCooper);
        Person lp = min(madMen, new AgeComparator());
        System.out.println(lp);

        List<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(2);
        li.add(3);
        Integer le = min(li, Integer::compareTo);
        System.out.println(le);
    }

    public static <T> T min(List<T> list, Comparator<T> comparator) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List is empty, cannot find minimum");
        }
        T lowesElement = list.get(0);
        for (int i=1; i<list.size(); i++) {
            final T element = list.get(i);
            if (comparator.compare(element, lowesElement) < 0) {
                lowesElement = element;
            }
        }
        return lowesElement;
    }
}
