package org.la.test.code.ps.pck.genr;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class CircularBufferTest {

    private CircularBuffer buffer = new CircularBuffer(2);

    @Test
    public void shouldOfferPollElement() {
        assertTrue(buffer.offer(1));
        assertEquals(1, buffer.poll());
        assertNull(buffer.poll());
    }
}
