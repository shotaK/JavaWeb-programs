package com.javaweb;

public class OverloadedClass {
    public static int addint (int x, int y) {
        return x+y;
    }

    public static double add(double x, int y) {
        double res = (double) x+y;
        return  res;
    }

    public static double add(double x, int y, double z) {
        double res = (double) x+y+z;
        return  res;
    }
}
