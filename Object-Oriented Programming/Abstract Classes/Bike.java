package com.javaweb;

abstract class Bike {
    public Bike() {
        System.out.println("Abstract class constructor is called");
    }
    abstract void run();
    void changeGear(){
        System.out.println("gear changed");
    }
}
