package com.javaweb;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.setWeight(50);
        apple.setSize(15);
        apple.setOuterSurface(10);
        System.out.println("Total volume of apple is: " + apple.getTotalVolume());
        apple.getAttributes();

        Fruit fruit = new Fruit();
        AldermanApple aldermanApple = new AldermanApple();
        fruit.setPlace("Poland");
        apple.setPlace("Germany");
        aldermanApple.setPlace("Estonia");
        System.out.println(fruit.getPlace());
        System.out.println(apple.getPlace());
        System.out.println(aldermanApple.getPlace());

    }
}
