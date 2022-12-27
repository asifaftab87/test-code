package org.la.test.code.thred.mcp;

import org.junit.jupiter.api.Test;
import org.la.test.code.thred.mcp.util.Util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MCPTest {

    @Test
    void demoTestMethod() {
        assertTrue(true);
    }

    @Test
    void exampleArraySize() {
        assertEquals(Util.generateExample(10).length, 10);
    }
}
