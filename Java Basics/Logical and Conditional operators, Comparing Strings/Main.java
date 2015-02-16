package com.javaweb;

public class Main {

    public static void main(String[] args) {
        int i = 5;
        System.out.println(!(i == 5)); // print: false
        System.out.println(!(i == 10)); // print: true

        int productType = 1;
        double price = 3.5;
        if ((productType == 1) & (price == 3.5)) {
            System.out.println("I am here"); // prints: I am here
        }

        int productClass = 2;
        double productPrice = 120;
        if ((productClass == 2) && (productPrice >= 100)) {
            System.out.println("you will get discount"); // prints: you will get discount
        }

        int productClassOr = 3;
        double productPriceOr = 120;
        if ((productClass == 2) || (productPrice >= 100)) {
            System.out.println("you still get discount"); // prints: you still get discount
        }

        double prodPrice = 120.0;

        int discountEligible = (prodPrice > 100) ? 1 : 0;
        System.out.println(discountEligible);

        int prodAmount = 1;
        String getText = "you have " + prodAmount + " product" + ((prodAmount<=1) ? "." : "s.");
        System.out.println(getText);

        String myStr = "Yes";
        if (myStr.equals("Yes")) {
            System.out.println("I am here"); // will be printed
        }

        if (myStr.equalsIgnoreCase("yes")) {
            System.out.println("I am here"); // will be printed
        }
    }

}














