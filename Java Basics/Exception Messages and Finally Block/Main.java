package com.javaweb;

public class Main {

    public static void main(String[] args) {
        int x = 23;
        int y = 0;

        try {
            int getDiv = x / y;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage()); // prints: / by zero
            e.printStackTrace(System.out); // prints: java.lang.ArithmeticException: / by zero and other details
            System.out.println(e.toString()); // prints: java.lang.ArithmeticException: / by zero
        }

        String myStr = "word";
        try {
            int myInt = Integer.parseInt(myStr);
        } catch (Exception e) {
            System.out.println("Something went wrong during parsing");
        } finally {
            System.out.println("parsing has been finished");
        }

    }
}





















