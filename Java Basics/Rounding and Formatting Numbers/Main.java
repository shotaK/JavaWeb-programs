package com.javaweb;

import java.text.NumberFormat;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        double lvl1 = 10.1;
        double lvl2 = 10.5;
        double lvl3 = 10.9;

        double ceilMin = Math.ceil(lvl1); // result: 11.0
        double ceilAve = Math.ceil(lvl2); // result: 11.0
        double ceilMax = Math.ceil(lvl3); // result: 11.0

        double floorMin = Math.floor(lvl1); // result: 10.0
        double floorAve = Math.floor(lvl2); // result: 10.0
        double floorMax = Math.floor(lvl3); // result: 10.0

        double rintMin = Math.rint(lvl1); // result: 10.0
        double rintAve = Math.rint(lvl2); // result: 10.0
        double rintMax = Math.rint(lvl3); // result: 11.0

        double roundMin = Math.round(lvl1); // result: 10.0
        double roundAve = Math.round(lvl2); // result: 11.0
        double roundMax = Math.round(lvl3); // result: 11.0

        double perNumber = 2.5896;
        NumberFormat forNumber = NumberFormat.getCurrencyInstance();
        String getNumber = forNumber.format(perNumber);
        System.out.println(getNumber); // result: $2.59

        double perc = 0.86;
        NumberFormat formatPerc = NumberFormat.getPercentInstance();
        String getPerc = formatPerc.format(perc);
        System.out.println(getPerc); // result: 86%

    }

}














