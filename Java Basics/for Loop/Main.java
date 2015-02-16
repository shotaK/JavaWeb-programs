package com.javaweb;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i <= 15; i++) {
            System.out.println(i);
        }

        int j = 0;
        for (int i = 0; i <= 15; i++) {
            j = j + i;
        }
        System.out.println("The sum is " + j);

        for (int i = 0; i <= 20; i+=2) {
            System.out.println(i);
        }

        for (int i = 20; i >= 0; i--) {
            System.out.println(i);
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < 10; k++) {
                System.out.print(i + "*" + k + "=" + i * k + " ");
            }
            System.out.println();
        }

    }

}














