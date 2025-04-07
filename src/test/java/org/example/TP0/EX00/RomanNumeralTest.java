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

    }
}