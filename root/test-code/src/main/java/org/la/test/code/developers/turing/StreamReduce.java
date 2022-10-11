package org.la.test.code.developers.turing;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Pole {
    double height;
    public Pole(double h) {
        height = h;
    }
    public void setHeight(double h) {
        height = h;
    }
    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Pole: "+height;
    }
}
public class StreamReduce {

    public static void main(String[] args) {
        List<Pole> listPole = new ArrayList<>();
        listPole.add(new Pole(23.12));
        listPole.add(new Pole(634.22));
        listPole.add(new Pole(34.23));
        listPole.add(new Pole(98.422));
        listPole.add(new Pole(78.34567));
        Optional<Pole> reduce = listPole.stream().reduce((a, b) -> a.getHeight() > b.getHeight() ? a : b);
        if (reduce.isPresent()) {
            System.out.println(reduce.get());
        }
    }
}
