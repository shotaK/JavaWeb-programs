package com.javaweb;

import java.util.Scanner;

public class Demo {
    private static Scanner scanner = new Scanner(System.in);
    public static String staticVar = "I am static variable";
    public Demo() {
        System.out.println("constructor");
    }

    {
        System.out.println("initializer");
    }

    static {
        System.out.println("static initializer");
    }

    {
        System.out.println("Please enter a word: ");
        String getWord = scanner.next();
        System.out.println("You have entered " + getWord);
    }
}


