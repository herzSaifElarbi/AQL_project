package org.example.TP0.EX00;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class LeapYearTest {

    //divisible by 4 but not by 100
    @Test
    public void leapYearsThatAreNonCenturialYears() {
        LeapYear ly = new LeapYear();
        boolean result = ly.isLeapYear(2016);
        Assertions.assertTrue(result);
    }
    //divisible by 400
    @Test
    public void leapCenturialYears() {
        LeapYear ly = new LeapYear();
        Assertions.assertTrue(ly.isLeapYear(2000));
    }
    //Divisible by 100 but not by 400

    @Test
    public void nonLeapCenturialYears() {
        LeapYear ly = new LeapYear();
        Assertions.assertFalse(ly.isLeapYear(1500));
    }
    //Not divisible by 4
    @Test
    public void nonLeapYears() {
        LeapYear ly = new LeapYear();
        Assertions.assertFalse(ly.isLeapYear(2017));
    }
    @Test
    void isLeapYear() {
    }
}