package com.javaweb;

public class Singer {
    private String firstName;
    private String lastName;
    boolean popular;

    public Singer(String fName, String lName) {
        firstName = fName;
        lastName = lName;
        System.out.println(firstName + " " + lastName);
    }

    public Singer(String fName, String lName, boolean pop) {
        firstName = fName;
        lastName = lName;
        popular = pop;
        System.out.println(firstName + " " + lastName + ((popular) ? " Popular Artist" : " not Popular Artist"));
    }
}
