package com.javaweb;

public class Main {

    public static void main(String[] args) {
        helloWorld();
        int getSum = intSum(15, 27);
        String getProduct = getProduct("Apple iPod nano 16GB", 145.00, 5);
        System.out.print(getProduct);

        int getSum2Int = sum(15, 27);
        int getSum3Int = sum(15, 27, 5);
        double getSumDbl = sum(2.3, 5.7);
        System.out.print("2 int sum: " + getSum2Int +
        ", Three int sum: " + getSum3Int + ", Double sum: " + getSumDbl);
    }

    public static void helloWorld() {
        System.out.print("Hello World!");
    }

    public static int intSum(int intPar1, int intPar2) {
        int sum = intPar1 + intPar2;
        return sum;
    }

    public static String getProduct(String prodName, double prodPrice, int prodAmount) {
        String productDescription = "Product name is: " + prodName +
                ", " + "product price is: " + prodPrice + ", " +
                "amount in the stock: " + prodAmount;
        return productDescription;
    }

    public static int sum(int intPar1, int intPar2) {
        int sum = intPar1 + intPar2;
        return sum;
    }

    public static int sum(int intPar1, int intPar2, int intPar3) {
        int sum = intPar1 + intPar2 + intPar3;
        return sum;
    }

    public static double sum(double intPar1, double intPar2) {
        double sum = intPar1 + intPar2;
        return sum;
    }

}

