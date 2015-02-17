package com.javaweb;

public class CallConstructor {
    private String firstName;
    private String lastName;
    private int age;

    public CallConstructor(int age) {
        this.age = age;
    }

    public CallConstructor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public CallConstructor(String firstName, String lastName, int age) {
        this(firstName, lastName);
        this.age = age;
    }
}
