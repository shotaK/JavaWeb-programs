package com.javaweb;

public class Main {

    public static void main(String[] args) {
        String s1 = "moonlight shines";
        int s1Length = s1.length();
        System.out.println(s1Length);

        String s2 = "ROY";
        String s2Lower = s2.toLowerCase();
        System.out.println(s2Lower); //output is: roy

        String s3 = "   this is     string        ";
        String s3Trim= s3.trim();
        System.out.println(s3Trim);

        String s4 = "Strings are immutable";
        char s4Char = s4.charAt(0);
        System.out.println(s4Char);

        String s5 = "Baseball";
        String s5Sub = s5.substring(4);
        System.out.println(s5Sub);

        String s6 = "Baseball";
        String s6Sub = s6.substring(2, 4);
        System.out.println(s6Sub);

        String s7 = "1500 N. Third Street:Fresno:CA:93722";
        String[] s7Split = s7.split(":");
        System.out.println(s7Split[0]);
        System.out.println(s7Split[1]);

        String s8 = "I like cars, because cars are fast";
        String s8Rep = s8.replaceFirst("car", "bike");
        String s8RepAll = s8.replaceAll("car", "bike");
        System.out.println(s8Rep);
        System.out.println(s8RepAll);
    }
}