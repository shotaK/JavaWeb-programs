package com.javaweb;

public class Main {
    public int hands = 2;
    public String language = "Java";
    public Boolean isActive = true;

    private int one = 1;
    private int two = 2;
    private String three = "three";

    static final double PI = 3.141592653589793;

    public static void main(String[] args) {
        double getTotalPrice = totalPrice(2.5, 4);
        System.out.print(getTotalPrice);

        visibleMethod();
    }

    public static double totalPrice(double price, int amount) {
        double totalPrice = price * amount;
        return totalPrice;
    }

    private static void visibleMethod() {
        System.out.print("This method is visible only in this class");
    }
}

