package com.javaweb;

public class Apple extends Fruit {
    private boolean Organic;

    public boolean isOrganic() {
        return Organic;
    }

    public void setOrganic(boolean organic) {
        Organic = organic;
    }

    public void getAttributes() {
        System.out.println("Color is: " + getColor());
        System.out.println("Size is: " + getSize());
        System.out.println("Weight is: " + getWeight());
        System.out.println("Is Organic: " + ((isOrganic()) ? "Yes" : "No"));
    }
}
