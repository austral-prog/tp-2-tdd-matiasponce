package com.tp2.password;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class PasswordValidatorTest {

    private final PasswordValidator validator = new PasswordValidator();

    @Test
    void passwordWithLessThan8CharactersShouldBeInvalid() {
        assertFalse(validator.isValid("Abc123!"));
        assertFalse(validator.isValid("A1!"));
        assertFalse(validator.isValid(""));
    }

    @Test
    void passwordWith8OrMoreCharactersShouldPassLengthValidation() {
        // These might still fail other validations, but length is OK
        assertTrue(validator.isValid("Abcdef12!"));
        assertTrue(validator.isValid("Password123!"));
    }

    @Test
    void passwordWithoutUppercaseLetterShouldBeInvalid() {
        assertFalse(validator.isValid("password123!"));
        assertFalse(validator.isValid("abcdef12!"));
    }

    @Test
    void passwordWithoutLowercaseLetterShouldBeInvalid() {
        assertFalse(validator.isValid("PASSWORD123!"));
        assertFalse(validator.isValid("ABCDEF12!"));
    }

    @Test
    void passwordWithoutNumberShouldBeInvalid() {
        assertFalse(validator.isValid("Password!"));
        assertFalse(validator.isValid("Abcdefgh!"));
    }

    @Test
    void passwordWithoutSpecialCharacterShouldBeInvalid() {
        assertFalse(validator.isValid("Password123"));
        assertFalse(validator.isValid("Abcdef12"));
    }

    @Test
    void passwordMeetingAllCriteriaShouldBeValid() {
        assertTrue(validator.isValid("Password123!"));
        assertTrue(validator.isValid("MySecure1@"));
        assertTrue(validator.isValid("Valid123#"));
        assertTrue(validator.isValid("Test1234$"));
    }

    @Test
    void passwordWithVariousSpecialCharactersShouldBeValid() {
        assertTrue(validator.isValid("Password1@"));
        assertTrue(validator.isValid("Password1#"));
        assertTrue(validator.isValid("Password1$"));
        assertTrue(validator.isValid("Password1%"));
        assertTrue(validator.isValid("Password1^"));
        assertTrue(validator.isValid("Password1&"));
        assertTrue(validator.isValid("Password1*"));
        assertTrue(validator.isValid("Password1()"));
        assertTrue(validator.isValid("Password1_"));
        assertTrue(validator.isValid("Password1+"));
        assertTrue(validator.isValid("Password1-"));
        assertTrue(validator.isValid("Password1="));
        assertTrue(validator.isValid("Password1[]"));
        assertTrue(validator.isValid("Password1{}"));
        assertTrue(validator.isValid("Password1|"));
        assertTrue(validator.isValid("Password1;"));
        assertTrue(validator.isValid("Password1:"));
        assertTrue(validator.isValid("Password1,"));
        assertTrue(validator.isValid("Password1."));
        assertTrue(validator.isValid("Password1<"));
        assertTrue(validator.isValid("Password1>"));
        assertTrue(validator.isValid("Password1?"));
    }
}
