package org.la.test.code.hackr.rank.test;

import org.junit.jupiter.api.Test;
import org.la.test.code.hackr.rank.singtel.array.ArraySetSingtel;
import org.la.test.code.util.IntegerUtil;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestClass {

    @Test
    public void first() {
        ArraySetSingtel obj = new ArraySetSingtel();
        System.out.println("Result list: " + obj.biggerArray(Arrays.asList(1, 2, 3)));
        assertTrue(true);
    }

    @Test
    public void firstA() {
        ArraySetSingtel obj = new ArraySetSingtel();
        System.out.println("Result list: " + obj.biggerArray(Arrays.asList(1, 2, 4)));
        assertTrue(true);
    }

    @Test
    public void second() {
        ArraySetSingtel obj = new ArraySetSingtel();
        System.out.println("Result list: " + obj.biggerArray(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)));
        assertTrue(true);
    }

    @Test
    public void secondA() {
        ArraySetSingtel obj = new ArraySetSingtel();
        System.out.println("Result list: " + obj.biggerArray(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 2, 1)));
        assertTrue(true);
    }

    @Test
    public void third() {
        ArraySetSingtel obj = new ArraySetSingtel();
        System.out.println("Result list: " + obj.biggerArray(Arrays.asList(9, 10)));
        assertTrue(true);
    }

    @Test
    public void fourth() {
        ArraySetSingtel obj = new ArraySetSingtel();
        obj.biggerArray(IntegerUtil.generateDynamicArray(10002, 100, 1000));
        assertTrue(true);
    }

    @Test
    public void five() {
        ArraySetSingtel obj = new ArraySetSingtel();
        System.out.println("Result list: " + obj.biggerArray(IntegerUtil.generateDynamicArray(20, 2, 5)));
        assertTrue(true);
    }

    @Test
    public void six() {
        ArraySetSingtel obj = new ArraySetSingtel();
        System.out.println("Result list: " + obj.biggerArray(IntegerUtil.generateDynamicArray(100, 5, 30)));
        assertTrue(true);
    }

    @Test
    public void seven() {
        ArraySetSingtel obj = new ArraySetSingtel();
        System.out.println("Result list: " + obj.biggerArray(IntegerUtil.generateDynamicArray(1000, 700, 1000)));
        assertTrue(true);
    }

    @Test
    public void eight() {
        ArraySetSingtel obj = new ArraySetSingtel();
        System.out.println("Result list: " + obj.biggerArray(IntegerUtil.generateDynamicArray(3000, 600, 1000)));
        assertTrue(true);
    }

    @Test
    public void nine() {
        ArraySetSingtel obj = new ArraySetSingtel();
        System.out.println("Result list: " + obj.biggerArray(IntegerUtil.generateDynamicArray(3000, 200, 1000)));
        assertTrue(true);
    }

    @Test
    public void ten() {
        ArraySetSingtel obj = new ArraySetSingtel();
        System.out.println("Result list: " + obj.biggerArray(IntegerUtil.generateDynamicArray(3000, 50, 1000)));
        assertTrue(true);
    }
}
