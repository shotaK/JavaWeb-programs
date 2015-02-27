package com.javaweb;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Cat();

        if(animal instanceof Cat) {
            System.out.println("it is Cat");
        } else {
            System.out.println("it is Animal");
        }

        OverloadedClass overloadedClass = new OverloadedClass();
        System.out.println(overloadedClass.addint(5, 14));
        System.out.println(overloadedClass.add(5.6, 10));
        System.out.println(overloadedClass.add(2.3, 14, 10.12));

        Bike bike = new Bike();
        bike.move();
    }
}
