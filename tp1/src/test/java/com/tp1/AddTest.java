package com.tp1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddTest {
    @Test
    public void testAdd() {
        Add calculator = new Add();
        assertEquals(5, calculator.add(2, 3));
    }
}