package com.javaweb;

public class Main {
    public static void main(String[] args) {
        AbstractChild abstractChild = new AbstractChild();
        String color = abstractChild.color("red");
        System.out.println(color);

        AbstractClass abstractClass = new AbstractChild();

        Honda honda = new Honda(); //Instantly prints: "Abstract class constructor is called"
        honda.run();
        honda.changeGear();
    }
}
