package com.javaweb;

public class Vehicle {
    int speed = 75;

    public Vehicle(int initialColor) {
        System.out.print("Vehicle color is: " + initialColor);
    }

    public Vehicle(String firstArg, int secArg) {
        System.out.println("another constructor, first arg: " + firstArg + " Second arg: " + secArg);
    }

}
