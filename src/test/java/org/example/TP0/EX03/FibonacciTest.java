package org.example.TP0.EX03;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    @Test
    @DisplayName("n < 0?")
    void Test(){
        int value = -2025;
        assertThrows(IllegalArgumentException.class, () -> {
            Fibonacci.fibonacci(value);
        }, "fibonacci(-2025) should throw an exception");
    }
    @Test
    @DisplayName("Fib(0) = 0?")
    void fib0Test() {
        assertEquals(0, Fibonacci.fibonacci(0));
    }
    @Test
    @DisplayName("Fib(1) = 1?")
    void fib1Test() {
        assertEquals(1, Fibonacci.fibonacci(1));
    }
    @Test
    @DisplayName("Fib(5) = 5?")
    void fib5Test() {
        assertEquals(5, Fibonacci.fibonacci(5));
    }
    @Test
    void fibonacci() {
    }
}