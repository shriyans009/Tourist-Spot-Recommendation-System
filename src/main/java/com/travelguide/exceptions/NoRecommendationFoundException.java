package com.travelguide.exceptions;

public class NoRecommendationFoundException extends RuntimeException {
    
    // Constructor that accepts a message
    public NoRecommendationFoundException(String message) {
        super(message);
    }
}
