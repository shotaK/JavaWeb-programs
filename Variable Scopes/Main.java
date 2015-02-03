package com.javaweb;

public class Main {

    public static int classVar1 = 25; // available in whole Main class

    public static void main(String[] args) {
        int localVar = 35; // available only in main method
        System.out.println(localVar);
        myStaticMethod(); // result: 30

        classVar1 = 45;
        int classVar1 = 60;
        System.out.println("In method variable " + classVar1);
        System.out.println("Class variable " + Main.classVar1);
    }

    public static void myStaticMethod() {
        int localVar1 = 5; // available only in myMethod() method
        if ( localVar1 < classVar1 ) {
            int localIfVar = 30; // available only in this If block
            System.out.println("Print If local variable " + localIfVar);
        }
    }

    public void myNonStaticMethod() {
        System.out.println(classVar1); // available even in non Static Methods
    }
}
