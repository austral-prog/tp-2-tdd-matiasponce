package com.tp2.roman;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanNumeralsTest {

    private final RomanNumerals converter = new RomanNumerals();

    @Test
    void convert1ToI() {
        assertEquals("I", converter.convert(1));
    }

    @Test
    void convert5ToV() {
        assertEquals("V", converter.convert(5));
    }

    @Test
    void convert10ToX() {
        assertEquals("X", converter.convert(10));
    }

    @Test
    void convert4ToIV() {
        assertEquals("IV", converter.convert(4));
    }

    @Test
    void convert9ToIX() {
        assertEquals("IX", converter.convert(9));
    }

    @Test
    void convert40ToXL() {
        assertEquals("XL", converter.convert(40));
    }

    @Test
    void convert50ToL() {
        assertEquals("L", converter.convert(50));
    }

    @Test
    void convert90ToXC() {
        assertEquals("XC", converter.convert(90));
    }

    @Test
    void convert100ToC() {
        assertEquals("C", converter.convert(100));
    }

    @Test
    void convert400ToCD() {
        assertEquals("CD", converter.convert(400));
    }

    @Test
    void convert500ToD() {
        assertEquals("D", converter.convert(500));
    }

    @Test
    void convert900ToCM() {
        assertEquals("CM", converter.convert(900));
    }

    @Test
    void convert1000ToM() {
        assertEquals("M", converter.convert(1000));
    }

    @Test
    void convertComplexNumbers() {
        assertEquals("MCMXCIV", converter.convert(1994));
        assertEquals("MMCDXLIV", converter.convert(2444));
        assertEquals("MCDXLIV", converter.convert(1444));
        assertEquals("CDXLIV", converter.convert(444));
    }

    @Test
    void convertAdditionalNumbers() {
        assertEquals("II", converter.convert(2));
        assertEquals("III", converter.convert(3));
        assertEquals("VI", converter.convert(6));
        assertEquals("VII", converter.convert(7));
        assertEquals("VIII", converter.convert(8));
        assertEquals("XI", converter.convert(11));
        assertEquals("XIV", converter.convert(14));
        assertEquals("XV", converter.convert(15));
        assertEquals("XIX", converter.convert(19));
        assertEquals("XX", converter.convert(20));
        assertEquals("XXIV", converter.convert(24));
        assertEquals("XXVII", converter.convert(27));
        assertEquals("XLVIII", converter.convert(48));
        assertEquals("XLIX", converter.convert(49));
        assertEquals("LXII", converter.convert(62));
        assertEquals("XCIII", converter.convert(93));
        assertEquals("CXLI", converter.convert(141));
        assertEquals("CLXIII", converter.convert(163));
        assertEquals("CCII", converter.convert(202));
        assertEquals("CCXLVI", converter.convert(246));
        assertEquals("CCCXXI", converter.convert(321));
        assertEquals("CDXII", converter.convert(412));
        assertEquals("DLXII", converter.convert(562));
        assertEquals("DCXLII", converter.convert(642));
        assertEquals("DCCXLII", converter.convert(742));
        assertEquals("DCCCXLII", converter.convert(842));
        assertEquals("CMXLII", converter.convert(942));
    }
}
