package org.la.test.code.util;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class IntegerUtil {

    public static List<Integer> generateDynamicArray(int size, int origin, int upperBound) {
        return new Random().ints(size, origin, upperBound).boxed().collect(Collectors.toList());
    }
}
