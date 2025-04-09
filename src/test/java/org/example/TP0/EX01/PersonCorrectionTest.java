package org.example.TP0.EX01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonCorrectionTest {

    //test de nom standard
    @Test
    @DisplayName("full name test")
    void getFullName() {
        //arange
        PersonCorrection person1 = new PersonCorrection("adam", "chit", 25);
        PersonCorrection person2 = new PersonCorrection("idris", "no7", 35);
        PersonCorrection person3 = new PersonCorrection("hod", "sale7", 0);
        //act
        String result1 = person1.getFullName();
        String result2 = person2.getFullName();
        String result3 = person3.getFullName();
        //assert
        assertAll(
                ()->assertEquals("adam chit", result1),
                ()->assertEquals("idris no7", result2),
                ()->assertEquals("hod sale7", result3)
        );
    }
    //<18
    @Test
    @DisplayName("Adult under age test")
    void UnderAgeTest(){
        //arange
        PersonCorrection person3 = new PersonCorrection("hod", "sale7", 15);
        //act+assert
        assertFalse(person3.isAdult());
    }
    //==18 here is boundary testing
    @Test
    @DisplayName("Adult boundary test")
    void isAdultBoundaryTest(){
        PersonCorrection person2 = new PersonCorrection("idris", "no7", 18);
        assertTrue(person2.isAdult());
    }
    //>18
    @Test
    @DisplayName("Adult test")
    void isAdult() {
        //arange
        PersonCorrection person1 = new PersonCorrection("adam", "chit", 25);
        //act+assert
        assertTrue(person1.isAdult());
    }
    @Test
    @DisplayName("age>=0 ???")
    void positiveAgeTest(){
        // Arrange & Act & Assert in one step
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> new PersonCorrection("hod", "sale7", -15),
                "Expected exception when age < 0"
        );
        assertEquals("Age must be positive", exception.getMessage());
    }
}