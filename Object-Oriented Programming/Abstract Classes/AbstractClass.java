package com.javaweb;

abstract class AbstractClass {
    abstract boolean hasDiskBrake();
    abstract String getNoofGears();
    public abstract int hit(int batSpeed);

    public String color;

    public void setColor(String c) {
        color = c;
    }
    public String getColor() {
        return color;
    }
    abstract public double area();
}
