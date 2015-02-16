package com.javaweb;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter an integer: ");
        int getInt = sc.nextInt();
        System.out.println("you have entered" + getInt);

        System.out.println("Enter a desired keyword: ");
        if (sc.hasNextInt()) {
            int getInt2 = sc.nextInt();
            System.out.println("You have entered Int: " + getInt);
        } else if (sc.hasNextDouble()) {
            Double getDouble = sc.nextDouble();
            System.out.println("You have entered Double: " + getDouble);
        } else {
            String getString = sc.next();
            System.out.println("You have entered String: " + getString);
        }
    }

}
