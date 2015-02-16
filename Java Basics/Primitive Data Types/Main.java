package com.javaweb;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {

        /*--------------byte-----------------*/
        byte a = 100; byte b = -50;

        /*--------------short-----------------*/
        short s = 10000; short r = -20000;

        /*--------------int-----------------*/
        int i = 100000; int j = -200000;

        /*--------------long-----------------*/
        long l = 100000L; long k = -200000L;

        int myInt;
        long myLong;
        myInt= 25;
        myLong = myInt;

        /*--------------float-----------------*/
        float f1 = 234.5f;

        /*--------------double-----------------*/
        double d1 = 123.4;

        double period = 99.0D;

        float value1 = 199.33F;
        double value2 = 200495.995D;

        /*--------------BigDecimal-----------------*/
        BigDecimal a1 = new BigDecimal("8250325.00005");
        BigDecimal b1 = new BigDecimal("4321456.00001");
        BigDecimal c1 = a1.add(b1);
        System.out.println(NumberFormat.getCurrencyInstance().format(c1));

        /*--------------double-----------------*/
        boolean one = true;

        /*--------------double-----------------*/
        char code = 'X';

    }
}
