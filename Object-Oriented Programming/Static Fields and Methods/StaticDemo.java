package com.javaweb;

public class StaticDemo {

    static private int myvar;
    private static int myvar2;

    public static int counter = 0;

    public void counterEnc() {
        counter++;
    }

    private String demoVar1;
    private int demoVar2;

    private void myMethod() {
        demoVar2++;
    }

    public static void main(String[] args) {
        //NoInstance noInstance = new NoInstance(); // won't compile
        String getVar = NoInstance.staticVar; // works fine

        // demoVar1 = "Wrong";
        // myMethod();

        StaticDemo staticDemo1 = new StaticDemo();
        staticDemo1.counterEnc();
        System.out.println("Object 1 counter: " + staticDemo1.counter);

        StaticDemo staticDemo2 = new StaticDemo();
        staticDemo2.counterEnc();

        System.out.println("Object 1 counter: " + staticDemo1.counter);
        System.out.println("Object 2 counter: " + staticDemo2.counter);
    }

    private static String demoVar3 = "right";

    public void goodMethod() {
        String res = "This is " + demoVar3;
    }
}
