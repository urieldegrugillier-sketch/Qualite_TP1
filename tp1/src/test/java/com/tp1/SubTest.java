package com.tp1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubTest {
    @Test
    public void testSub() {
        Sub calculator = new Sub();
        assertEquals(2, calculator.sub(5, 3));
    }
}
