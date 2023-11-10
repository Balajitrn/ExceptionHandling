package com.jls;

/**
 * @Try block: this is where you put code that might cause exception
 * @Catch block: This block catches and handles the exception, you can have multiple catch blocks
 * for different types of exceptions
 * @Finally block: code in this block is always executed after the try and catch block,
 * regardless of whether an exception is thrown or caught. it's used for code cleanup.
 */
public class DivisionExample {

    public static void main(String[] args) {
        int a = 10;
        int b = 2;  // Divisor is zero, which will cause an exception

        try {
            int result = a/b; // this code would thrown an exception
            System.out.println("Result: " + result);
        }  catch (Exception e){
            // this block can handle the exception
            e.printStackTrace();
            System.out.println("Cannot divide by zero: "+ e.getMessage());
        } finally {
            // this block is always executed
            System.out.println("inside the finally block");
        }
    }
}
