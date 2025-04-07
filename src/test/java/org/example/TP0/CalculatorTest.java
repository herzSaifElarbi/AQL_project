package org.example.TP0;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {


    @Test
    void addShouldReturnTheSumOfTwoNumbers() {
        Calculator calculator = new Calculator();
        //Arange
        int a = 2;
        int b = 3;
        //Act
        double result = Calculator.add(2,3);
        //Assert
        assertEquals(5, result);
    }

    @Test
    @DisplayName("Add two numbers")
    void add() {
        assertEquals(4, Calculator.add(2,2));
    }

    @Test
    @DisplayName("Multiply two numbers")
    void multiply() {
        assertAll(
                ()-> assertEquals(4, Calculator.multiply(2,2)),
                ()-> assertEquals(-4, Calculator.multiply(2,-2)),
                ()-> assertEquals(4, Calculator.multiply(-2,-2)),
                ()-> assertEquals(0, Calculator.multiply(1,0))
        );
    }
}