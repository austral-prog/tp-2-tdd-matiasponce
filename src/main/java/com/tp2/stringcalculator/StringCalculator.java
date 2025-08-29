package com.tp2.stringcalculator;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
    
    public int add(String numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }
        
        // Split by comma and newline
        String[] parts = numbers.split("[,\n]");
        List<Integer> negatives = new ArrayList<>();
        int sum = 0;
        
        for (String part : parts) {
            if (!part.trim().isEmpty()) {
                int number = Integer.parseInt(part.trim());
                if (number < 0) {
                    negatives.add(number);
                } else {
                    sum += number;
                }
            }
        }
        
        if (!negatives.isEmpty()) {
            StringBuilder message = new StringBuilder("Negative numbers not allowed: ");
            for (int i = 0; i < negatives.size(); i++) {
                if (i > 0) {
                    message.append(", ");
                }
                message.append(negatives.get(i));
            }
            throw new IllegalArgumentException(message.toString());
        }
        
        return sum;
    }
}
