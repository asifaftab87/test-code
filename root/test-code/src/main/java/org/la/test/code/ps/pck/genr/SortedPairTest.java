package org.la.test.code.ps.pck.genr;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SortedPairTest {

    @Test
    public void shouldRetainOrderOfOrderPair() {
        SortedPair<Integer> pair = new SortedPair<>(1, 2);
        assertEquals(1, pair.getFirst().intValue());
        assertEquals(2, pair.getSecond().intValue());
    }

    @Test
    public void shouldFlipOrderOfOrderPair() {
        SortedPair<Integer> pair = new SortedPair<>(2, 1);
        assertEquals(1, pair.getFirst().intValue());
        assertEquals(2, pair.getSecond().intValue());
    }
}
