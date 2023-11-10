package com.jls;

/**
 * this is the custom exception
 */
public class UnderAgeException extends Exception{
    public UnderAgeException(String message) {
        super(message);
    }
}
