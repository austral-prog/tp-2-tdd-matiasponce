package com.tp2.password;

public class PasswordValidator {
    
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()_+-=[]{}|;:,.<>?";
    
    public boolean isValid(String password) {
        if (password == null || password.length() < 8) {
            return false;
        }
        
        return hasUppercase(password) && 
               hasLowercase(password) && 
               hasNumber(password) && 
               hasSpecialCharacter(password);
    }
    
    private boolean hasUppercase(String password) {
        return password.chars().anyMatch(Character::isUpperCase);
    }
    
    private boolean hasLowercase(String password) {
        return password.chars().anyMatch(Character::isLowerCase);
    }
    
    private boolean hasNumber(String password) {
        return password.chars().anyMatch(Character::isDigit);
    }
    
    private boolean hasSpecialCharacter(String password) {
        return password.chars().anyMatch(ch -> SPECIAL_CHARACTERS.indexOf(ch) >= 0);
    }
}
