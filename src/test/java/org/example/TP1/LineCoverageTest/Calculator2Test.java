package org.example.TP1.LineCoverageTest;

import org.example.TP1.Calculator2;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Calculator2Test {
    @Test
    @DisplayName("max = a")
    void maxIsA(){
        Calculator2 calculator2 =new Calculator2();
        int a = 3, b=2, c=1;
        assertEquals(a, calculator2.max(a, b, c));
    }
    @Test
    @DisplayName("max = b")
    void maxIsB(){
        Calculator2 calculator2 =new Calculator2();
        int b = 3, c=2, a=1;
        assertEquals(b, calculator2.max(a, b, c));
    }

    @Test
    @DisplayName("max = c")
    void maxIsC(){
        Calculator2 calculator2 =new Calculator2();
        int c = 3, b=2, a=1;
        assertEquals(c, calculator2.max(a, b, c));
    }

    @Test
    void max() {
    }
}