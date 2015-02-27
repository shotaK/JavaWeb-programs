package com.javaweb;

public class Honda extends Bike {
    @Override
    void run() {
        System.out.println("Honda is running");
    }

    @Override
    void changeGear() {
        super.changeGear();
    }
}
