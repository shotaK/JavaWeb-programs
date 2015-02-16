package com.javaweb;

public class Main {

    public static void main(String[] args) {
        int a = 32, b = 5;
        int c = a + b; // result: 37
        int d = a - b; // result: 27
        int e = a * b; // result: 160
        int f = a / b; // result: 6
        int g = a % b; // result: 27

        double x = 5.5, y = 2.0;
        double m = x + y; // result: 7.5
        double n = x - y; // result: 3.5
        double o = x * y; // result: 11.0
        double p = x / y; // result: 2.75
        double q = x % y; // result: 27
        x++; //result: 6.5
        y--; //result: 1.0

        int int1 = 22, int2 = 5;
        double myDbl = int1 / int2; // result: 4.0
        double myDblCast = (double) int1 / int2; // result: 4.4

        int myint = 5;
        myint = myint + 1; // result: 6

        int myInt3 = 5;
        myInt3++; // post result: 6

        int myInt2 = 5, myInt4 = 5;

        System.out.println(myInt2++); // result: 5
        System.out.println(myInt2); // result: 6

        System.out.println(++myInt4); // result: 6
        System.out.println(myInt4); // result: 6

        int myInt5 = 5; int myInt6 = 3;
        int myInt7 = myInt5 * myInt6++;
        System.out.println(myInt7); // result: 15
        int myInt8 = myInt5 * ++myInt6;
        System.out.println(myInt8); // result: 25
    }

}







