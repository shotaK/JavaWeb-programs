package com.javaweb;

public class Main {

    public static void main(String[] args) {

        double price = 60.0;
        double discount;
        int salestype = 1;

        if (salestype == 1) {
            if (price < 10.0) {
                discount = 0;
            } else {
                discount = 0.5;
            }
        } else {
            if (price < 100.0) {
                discount = 0.2;
            } else {
                discount = 0.3;
            }
        }

        if (price <= 10.0) {
            System.out.print("It is a cheap product");
        }
        else if (price > 10.0 && price <= 100.0) {
            System.out.print("It is average priced product");
            // will be printed
        }
        else {
            System.out.print("It is expensive");
        }

    }

}














