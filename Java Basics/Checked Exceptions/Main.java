package com.javaweb;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
        openFile("C://fakepath/file.txt");

        try {

        } catch (ArrayIndexOutOfBoundsException | ArithmeticException ee) {

        }
    }

    public static void openFile(String fileSource) {
        try {
            FileInputStream fileInputStream = new FileInputStream(fileSource);
        } catch (FileNotFoundException e) {

        }
    }


}

