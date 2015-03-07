package com.javaweb;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int amout[] = new int[10];
        Arrays.fill(amout, 15);

        for (int amoutUnit : amout) {
            System.out.print(amoutUnit + ", ");
        }

        int arrayOriginal[] = {42, 55, 21};
        int cloneArray[] = Arrays.copyOf(arrayOriginal, 3); // 42, 55, 21,
        int cloneArray1[] = Arrays.copyOf(arrayOriginal, 1); // 42,
        int cloneArray2[] = Arrays.copyOf(arrayOriginal, 6); // 42, 55, 21, 0, 0, 0,
        printIntArray(cloneArray);
        printIntArray(cloneArray1);
        printIntArray(cloneArray2);

        int arrayOriginal1[] = {42, 55, 21, 16, 100, 88};
        int cloneArray3[] = Arrays.copyOfRange(arrayOriginal1, 1, 5); // 55, 21, 16, 100,
        printIntArray(cloneArray3);

        String twistedArray[] = {"jaha", "baba", "aba", "12ret"};
        Arrays.sort(twistedArray); // 12ret, aba, baba, jaha,
        printStrArray(twistedArray);

        int intArray[] = {35, 2, 5, 96, 25};
        Arrays.sort(intArray);
        if (Arrays.binarySearch(intArray, 25) >= -1) {
            System.out.println("Result Found");
        } else {
            System.out.println("Nothing Found");
        }

        String strArray[] = {"jaha", "baba", "aba", "12ret"};
        Arrays.sort(strArray);
        if (Arrays.binarySearch(strArray, "jaha") >= -1) {
            System.out.println("Result Found");
        } else {
            System.out.println("Nothing Found");
        }

        String strArray2[] = {"jaha", "baba", "aba", "12ret"};
        String strArray3[] = {"jaha", "baba", "aba", "12ret"};
        String strArray4[] = {"jaha2", "baba", "aba", "12ret"};
        if (Arrays.equals(strArray2, strArray3)) {
            System.out.println("Arrays equal");
        } else {
            System.out.println("Not equal");
        }

        if (Arrays.equals(strArray2, strArray4)) {
            System.out.println("Arrays equal");
        } else {
            System.out.println("Not equal");
        }
    }

    public static void printIntArray(int[] ar) {
        System.out.println();
        for (int item : ar) {
            System.out.print(item + ", ");
        }
    }

    public static void printStrArray(String[] ar) {
        System.out.println();
        for (String item : ar) {
            System.out.print(item + ", ");
        }
    }

}


