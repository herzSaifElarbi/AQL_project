package org.example.TP0.EX05;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    @Test
    @DisplayName("Boundary test 0! = 0??")
    void Boundary0FactTest() {
        assertEquals(1, Factorial.factorial(0));
    }
    @Test
    @DisplayName("Special test 1! = 1??")
    void special1Test() {
        assertEquals(1, Factorial.factorial(1));
    }

    @Test
    @DisplayName("exception test -5! = ???")
    void exceptionValuesTest() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> Factorial.factorial(-5),
                "(negativeNumber)!=>exception"
        );
        assertEquals("n must be positive", exception.getMessage());
    }
    @Test
    @DisplayName("BasicTests(3!=6,4!=24)??")
    void factorial() {
        assertAll(
                ()->assertEquals(6, Factorial.factorial(3)),
                ()->assertEquals(24, Factorial.factorial(4))
        );
    }
}