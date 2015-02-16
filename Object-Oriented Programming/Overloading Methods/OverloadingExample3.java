package com.javaweb;

public class OverloadingExample3 {
    public void display(String displayParStr, int displayPar) {
        System.out.println(displayPar + displayParStr);
    }

    public void display(int displayPar, String displayParStr) {
        System.out.println(displayPar + displayParStr);
    }
}
