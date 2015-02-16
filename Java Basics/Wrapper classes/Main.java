package com.javaweb;

public class Main {

    public static void main(String[] args) {

        /*--------------Wrapper classes-----------------*/
        int prInt = 15; //declares an int variable
        Integer wrIntA1 = new Integer(27); // instantiates an Integer object

        Integer wrIntA2 = new Integer(15);
        Integer wrIntA3 = new Integer("15");

        /*--------------wrapper classes methods-----------------*/
        Integer wrInt1 = new Integer(15);
        Integer wrInt2 = new Integer("15");
        Integer wrInt3 = new Integer(37);

        System.out.println(wrInt1.compareTo(wrInt2)); // result: 0
        System.out.println(wrInt1.compareTo(wrInt3)); // result: -1 as 15 < 37

        Float wrFloat1 = new Float(1.2);
        Float wrFloat2 = new Float("15.36");
        Float wrFloat3 = new Float("1.2");

        System.out.println(wrFloat1.equals(wrFloat2)); // result: false
        System.out.println(wrFloat1.equals(wrFloat3)); // result: true

        System.out.println(Float.compare(wrFloat2, wrFloat3)); // result: 1 as 1.2 < 15.6
        System.out.println(Float.compare(wrFloat1, wrFloat3)); // result: 0

    }
}
