package com.tp2.leapyear;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class LeapYearTest {

    @Test
    void yearDivisibleBy4IsLeapYear() {
        assertTrue(LeapYear.isLeapYear(2004));
        assertTrue(LeapYear.isLeapYear(2008));
        assertTrue(LeapYear.isLeapYear(2012));
    }

    @Test
    void yearNotDivisibleBy4IsNotLeapYear() {
        assertFalse(LeapYear.isLeapYear(2001));
        assertFalse(LeapYear.isLeapYear(2002));
        assertFalse(LeapYear.isLeapYear(2003));
    }

    @Test
    void yearDivisibleBy100IsNotLeapYear() {
        assertFalse(LeapYear.isLeapYear(1700));
        assertFalse(LeapYear.isLeapYear(1800));
        assertFalse(LeapYear.isLeapYear(1900));
    }

    @Test
    void yearDivisibleBy400IsLeapYear() {
        assertTrue(LeapYear.isLeapYear(1600));
        assertTrue(LeapYear.isLeapYear(2000));
        assertTrue(LeapYear.isLeapYear(2400));
    }

    @Test
    void edgeCases() {
        assertFalse(LeapYear.isLeapYear(1));
        assertTrue(LeapYear.isLeapYear(4));
        assertFalse(LeapYear.isLeapYear(100));
        assertTrue(LeapYear.isLeapYear(400));
    }
}
