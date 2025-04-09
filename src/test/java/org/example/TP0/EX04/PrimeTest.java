package org.example.TP0.EX04;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {
    @DisplayName("special case 1 Tests?")
    void specialTest() {
        Prime prime = new Prime();
        assertFalse(prime.isPrime(1));
    }
    @Test
    @DisplayName("boundary=2 Tests?")
    void boundary2Test() {
        Prime prime = new Prime();
        assertTrue(prime.isPrime(2));
    }
    @Test
    @DisplayName("<2 Tests?")
    void FalseUnder2Test() {
        Prime prime = new Prime();
        assertFalse(prime.isPrime(-5));
    }
    @Test
    @DisplayName(">2 false(4, 6, 12) Tests?")
    void FalseAbove2Test() {
        Prime prime = new Prime();
        assertAll(
                ()->assertFalse(prime.isPrime(4)),
                ()->assertFalse(prime.isPrime(6)),
                ()->assertFalse(prime.isPrime(12))
        );
    }

    @Test
    @DisplayName("basic tests 3, 5, 7?")
    void isPrime() {
        Prime prime = new Prime();
        assertAll(
                ()->assertTrue(prime.isPrime(3)),
                ()->assertTrue(prime.isPrime(5)),
                ()->assertTrue(prime.isPrime(7))
        );
    }
}