package com.jls;

/**
 * throwing exception is a way to signal that something
 * unexpected has happened in your program and that it can't continue to execute in normal way
 */
public class AgeCheckerCustom {
    public void checkAge(int age) throws UnderAgeException {
        if(age < 18) {
            throw new UnderAgeException("Age is less than 18, not eligible for vote");
        } else {
            System.out.println("Age is ok");
        }
    }

    public static void main(String[] args) {
        AgeCheckerCustom ageChecker = new AgeCheckerCustom();
        try{
            ageChecker.checkAge(17); // this will cause exception
        } catch (UnderAgeException e){
            System.out.println("Exception caught: "+ e.getLocalizedMessage());
        }

    }
}
