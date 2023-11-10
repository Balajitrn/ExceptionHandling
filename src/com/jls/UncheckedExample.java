package com.jls;

public class UncheckedExample {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        try {
            int number = numbers[5]; // this will throw an ArrayIndexOutOfBoundsExceptions
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("An error occured: "+ e.getMessage());
        }
        
    }
}
