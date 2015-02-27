package com.javaweb;

public class AbstractChild extends AbstractClass{
    public String color(String color) {
        super.setColor(color);
        return getColor();
    }
    String getNoofGears() {
        return "res";
    }
    public double area() {
        return 5.2;
    }
    boolean hasDiskBrake() {
        return true;
    }
    public int hit(int batSpeed) {
        return batSpeed;
    }
}
