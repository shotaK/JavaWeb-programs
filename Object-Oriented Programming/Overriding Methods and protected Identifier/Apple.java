package com.javaweb;

public class Apple extends Fruit {
    int outerSurface;

    public int getOuterSurface() {
        return outerSurface;
    }

    public void setOuterSurface(int outerSurface) {
        this.outerSurface = outerSurface;
    }

    @Override
    public int getTotalVolume() {
        int totalVolume = getWeight() * getSize() * outerSurface;
        return totalVolume;
    }

    public void getAttributes() {
        System.out.println("Size is: " + getSize());
        System.out.println("Weight is: " + getWeight());
    }
}
