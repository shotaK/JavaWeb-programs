package com.javaweb;

public class Fruit {
    private int weight;
    private int size;

    protected String getPlace() {
        return place;
    }

    protected void setPlace(String place) {
        this.place = place;
    }

    protected String place;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTotalVolume() {
        int totalVolume = weight * size;
        return totalVolume;
    }
}
