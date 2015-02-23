package com.javaweb;

public class Bike extends Vehicle {
    int speed = 135;

    public Bike() {
        super("first", 20);
    }

    public Bike(int someArg) {
        super(someArg);
    }

    public void display() {
        System.out.println("Speed of Vehicle is: " + super.speed);
    }
}
