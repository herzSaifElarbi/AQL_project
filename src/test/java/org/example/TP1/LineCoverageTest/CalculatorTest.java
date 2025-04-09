package org.example.TP1.LineCoverageTest;

import org.example.TP1.BranchCoverageTest.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    //lines coverage
    @Test
    void add() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.add(1, 1));
    }
    @Test
    void subtract() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.subtract(1, 1));
    }
    @Test
    void multiply() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.multiply(0,1));
    }
    @Test
    void divide() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.divide(4, 2));
    }
    @Test
    void divideZeroTest(){
        Calculator calculator = new Calculator();
        ArithmeticException exception = assertThrows(
          ArithmeticException.class,
                ()->calculator.divide(5, 0),
                "zero => deivide by zero"
        );
        assertEquals("Division by zero", exception.getMessage());
    }
}