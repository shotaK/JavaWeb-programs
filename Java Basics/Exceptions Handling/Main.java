package com.javaweb;

public class Main {

    public static void main(String[] args) {
        int x = 23;
        int y = 0;
        String myStr = "word";
        String myNull = null;

        try {
            int getDiv = x / y;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed");
        }

        try {
            myNull.toUpperCase();
        } catch (NullPointerException e) {
            System.out.println("current String is null");
        }

        try {
            int myInt = Integer.parseInt(myStr);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        }

        try {
            int getDiv = x / y;
            myNull.toUpperCase();
            int myInt = Integer.parseInt(myStr);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed");
        } catch (NullPointerException e) {
            System.out.println("current String is null");
        } catch (Exception e) {
            System.out.println("Something went wrong during parsing");
        }

    }
}

