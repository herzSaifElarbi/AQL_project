package org.example.TP1.LineCoverageTest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class PrimeTest {
    @Test
    @DisplayName("n<2?")
    void valueUnderNonPrime2Test(){
        assertFalse(Prime.isPrime(0));
    }
    @Test
    @DisplayName("n>2 and non Prime")
    void valueAboveNonPrime2Test(){
        assertFalse(Prime.isPrime(4));
    }
    @Test
    @DisplayName("n>2 and prime")
    void isPrime() {
        assertTrue(Prime.isPrime(3));
    }
}