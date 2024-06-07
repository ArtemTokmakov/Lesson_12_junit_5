package org.aston;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class FactorialTest {

    @Test
    public void testCalculateFactorial() {
        assertEquals(1, Factorial.calculateFactorial(0));
        assertEquals(1, Factorial.calculateFactorial(1));
        assertEquals(2, Factorial.calculateFactorial(2));
        assertEquals(6, Factorial.calculateFactorial(3));
        assertEquals(24, Factorial.calculateFactorial(4));
        assertEquals(120, Factorial.calculateFactorial(5));
        assertEquals(720, Factorial.calculateFactorial(6));
        assertEquals(5040, Factorial.calculateFactorial(7));
        assertEquals(40320, Factorial.calculateFactorial(8));
        assertEquals(362880, Factorial.calculateFactorial(9));
        assertEquals(3628800, Factorial.calculateFactorial(10));
    }
}