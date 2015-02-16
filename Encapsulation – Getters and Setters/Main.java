package com.javaweb;

public class Main {

    public static void main(String[] args) {
        Dummy dummy = new Dummy();
        dummy.setName("Name is Java");
        String getName = dummy.getName();
        System.out.println(getName); //prints: Name is Java

        dummy.setActive(true);
        boolean isActive = dummy.isActive();
        System.out.println(isActive); //prints: true

        System.out.println(dummy.getClannName());
    }

}

