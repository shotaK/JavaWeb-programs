package com.javaweb;

public class Main {

    public static void main(String[] args) {
        int count = 5;
        String msg = "There are ";
        msg += count;
        msg += " apples in the basket.";

        StringBuilder strBuilder = new StringBuilder("Nice day!");
        strBuilder.append(" And good night!");
        System.out.println(strBuilder); // Nice day! And good night!

        strBuilder.delete(0, 14);
        System.out.println(strBuilder); // good night!

        strBuilder.insert(5, "starry ");
        System.out.println(strBuilder); // good starry night!

        String stringB =  strBuilder.substring(5, strBuilder.length());
        System.out.println(strBuilder); // good starry night!
        System.out.println(stringB); // starry night!
    }
}