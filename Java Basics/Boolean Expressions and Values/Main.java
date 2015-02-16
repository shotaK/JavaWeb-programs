package com.javaweb;

public class Main {

    public static void main(String[] args) {

        boolean bool = true;

        int i = 5;
        int j = 10;
        int k = 27;

        double x = 5.0;
        double y = 6.0;
        double z = 13.5;

        System.out.println(i == 5); // result: true
        System.out.println(i == 10); // result: false
        System.out.println(i == j); // result: false
        System.out.println(i == j - 5); // result: true
        System.out.println(i == j / 2); // result: true
        System.out.println(i > j); // result: false

        System.out.println(i == x); // Casting allows the comparison, and 5.0 is equal to 5.
        System.out.println(k == z * 2); // result: true
    }

}














