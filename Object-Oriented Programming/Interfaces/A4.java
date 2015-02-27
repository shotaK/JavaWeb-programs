package com.javaweb;

public class A4 extends A implements Printable, Readable {
    @Override
    public void print() {
        System.out.println(MESSAGEOK);
    }

    @Override
    public int quality() {
        return 5;
    }
}
