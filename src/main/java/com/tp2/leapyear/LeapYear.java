package com.tp2.leapyear;

public class LeapYear {
    
    public static boolean isLeapYear(int year) {
        // A year is a leap year if:
        // - It's divisible by 400, OR
        // - It's divisible by 4 AND not divisible by 100
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        return year % 4 == 0;
    }
}
