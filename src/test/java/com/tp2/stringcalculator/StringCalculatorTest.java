package com.tp2.stringcalculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StringCalculatorTest {

    private final StringCalculator calculator = new StringCalculator();

    @Test
    void emptyStringShouldReturn0() {
        assertEquals(0, calculator.add(""));
    }

    @Test
    void singleNumberShouldReturnThatNumber() {
        assertEquals(1, calculator.add("1"));
        assertEquals(5, calculator.add("5"));
        assertEquals(42, calculator.add("42"));
    }

    @Test
    void twoNumbersSeparatedByCommaShouldReturnTheirSum() {
        assertEquals(3, calculator.add("1,2"));
        assertEquals(7, calculator.add("3,4"));
        assertEquals(15, calculator.add("7,8"));
    }

    @Test
    void multipleNumbersSeparatedByCommaShouldReturnTheirSum() {
        assertEquals(6, calculator.add("1,2,3"));
        assertEquals(10, calculator.add("1,2,3,4"));
        assertEquals(21, calculator.add("1,2,3,4,5,6"));
    }

    @Test
    void numbersSeparatedByNewlineShouldWorkAsDelimiter() {
        assertEquals(6, calculator.add("1\n2,3"));
        assertEquals(10, calculator.add("1,2\n3,4"));
        assertEquals(15, calculator.add("1\n2\n3\n4\n5"));
    }

    @Test
    void negativeNumbersShouldThrowIllegalArgumentException() {
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class, 
            () -> calculator.add("1,-2,3")
        );
        assertEquals("Negative numbers not allowed: -2", exception.getMessage());
    }

    @Test
    void multipleNegativeNumbersShouldThrowIllegalArgumentExceptionWithAllNegatives() {
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class, 
            () -> calculator.add("1,-2,3,-4,-5")
        );
        assertEquals("Negative numbers not allowed: -2, -4, -5", exception.getMessage());
    }

    @Test
    void mixedDelimitersWithNegativesShouldThrowException() {
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class, 
            () -> calculator.add("1\n-2,3,-4")
        );
        assertEquals("Negative numbers not allowed: -2, -4", exception.getMessage());
    }

    @Test
    void onlyNegativeNumbersShouldThrowException() {
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class, 
            () -> calculator.add("-1,-2,-3")
        );
        assertEquals("Negative numbers not allowed: -1, -2, -3", exception.getMessage());
    }
}
