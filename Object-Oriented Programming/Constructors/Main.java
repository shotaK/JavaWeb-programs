package com.javaweb;

public class Main {

    private int myInt;

    public Main() {
        myInt = 25;
    }

    public Main(int intPAr) {
        myInt = intPAr;
    }

    public String getResult() {
        return "The result is: " + myInt;
    }

    public static void main(String[] args) {
        Example example = new Example(); // text is printed to console

        Singer singer = new Singer("Freddie", "Mercury"); // prints: Freddie Mercury
        Singer singerPopular = new Singer("Freddie", "Mercury", true); // prints: Freddie Mercury Popular Artist

        Demo demo = new Demo();

        Main main = new Main();
        Main mainPar = new Main(50);
        Main mainRp = new Main();

        System.out.println(main.getResult());
        System.out.println(mainPar.getResult());
        System.out.println(mainRp.getResult());

    }
}

