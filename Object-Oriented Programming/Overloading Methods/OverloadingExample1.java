package com.javaweb;

public class OverloadingExample1 {
    public void display(int displayPar) {
        System.out.println(displayPar);
    }

    public void display(int displayPar, String displayParStr) {
        System.out.println(displayPar + displayParStr);
    }
}
