package com.jls;

/**
 * throwing exception is a way to signal that something
 * unexpected has happened in your program and that it can't continue to execute in normal way
 */
public class AgeChecker {
    public void checkAge(int age) {
        if(age < 18) {
            throw new IllegalArgumentException("Age is less than 18, not eligible for vote");
        } else {
            System.out.println("Age is ok");
        }
    }

    public static void main(String[] args) {
        AgeChecker ageChecker = new AgeChecker();
        try{
            ageChecker.checkAge(17); // this will cause exception
        } catch (IllegalArgumentException e){
            System.out.println("Exception caught: "+ e.getLocalizedMessage());
        }

    }
}
