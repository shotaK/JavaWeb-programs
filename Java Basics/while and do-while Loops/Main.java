package com.javaweb;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int countEven = 2;
        while (countEven < 25) {
            if (countEven==16) {
                break;
            }
            System.out.println(countEven); // prints till 14
            countEven +=2;
        }

        int infiniteCount = 2;
        while (true) {
            if (infiniteCount==20) {
                break;
            }
            System.out.println(infiniteCount); // prints to 20
            infiniteCount += 2;
        }

        while (true) {
            System.out.println("do you want to continue?");
            String getWish = scanner.next();
            if (getWish.equalsIgnoreCase("n")) {
                System.out.println("ending your request");
                break;
            } else {
                System.out.println("resuming...");
            }
        }

        int contNumber = 0;
        while (contNumber < 24) {
            contNumber +=2;

            if (contNumber == 16) {
                continue;
            }
            System.out.println(contNumber);

        }

        int doint = 2;
        do {
            System.out.println(doint);
            doint += 2;
        } while (doint < 26);

        do {
            System.out.println("I will be printed");
        } while (false);

    }

}














