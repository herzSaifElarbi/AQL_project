package org.example.TP0.EX00;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralTest {
    @Test
    void singleNumber(){
        //arrange
        RomanNumeral romanNumeral = new RomanNumeral();
        String str = "I";
        //Act
        int result = romanNumeral.convert(str);
        //Assert
        assertEquals(1, result);
    }

    @Test
    void numberWithManyDigits(){
        //arrange
        RomanNumeral romanNumeral = new RomanNumeral();
        String str = "VIII";
        //act
        int result = romanNumeral.convert(str);
        //assertion
        assertEquals(8,result);

    }
    @Test
    void convert() {
        //arange
        RomanNumeral romanNumeral = new RomanNumeral();
        //act + assert
        assertAll(
                ()->assertEquals(1, romanNumeral.convert("I")),//base case
                ()->assertEquals(6, romanNumeral.convert("VI")),//normal add
                ()->assertEquals(12, romanNumeral.convert("XII")),//multiple add
                ()->assertEquals(4, romanNumeral.convert("IV")),//special case(5 - 1)
                ()->assertEquals(9, romanNumeral.convert("IX")),//same(10 - 1)
                ()->assertEquals(8, romanNumeral.convert("VIII"))//repeated letters
        );
    }
}