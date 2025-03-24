package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class AppTest {
    
    @Test
    void testValue() {
        TriangleNumberCalculator calculator = new TriangleNumberCalculator();
        assertEquals(1, calculator.value(1), "The first triangular number should be 1");
        assertEquals(3, calculator.value(2), "The second triangular number should be 3");
        assertEquals(10, calculator.value(4), "The fourth triangular number should be 10");
    }

    @Test
    void testAdd() {
        TriangleNumberCalculator calculator = new TriangleNumberCalculator();
        assertEquals(2, calculator.add(1, 1), "1 + 1 should be 2");
        assertEquals(9, calculator.add(2, 3), "3 + 6 should be 9");
        assertEquals(13, calculator.add(4, 2), "10 + 3 should be 13");
    }

    @Test
    void testSubtract() {
        TriangleNumberCalculator calculator = new TriangleNumberCalculator();
        assertEquals(0, calculator.subtract(1, 1), "1 - 1 should be 0");
        assertEquals(-3, calculator.subtract(2, 3), "3 - 6 should be -3");
        assertEquals(7, calculator.subtract(4, 2), "10 - 3 should be 7");
    }
}
