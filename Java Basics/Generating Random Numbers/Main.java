package com.javaweb;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int getRandomValue = getRandom(10, 25);
        System.out.println(getRandomValue); //result example: 0.46469813419723316

        System.out.print(getRandom2(30, 45));
    }

    public static int getRandom(int min, int max) {
        double genRand = Math.random();
        int getRandom = (int) (genRand * (max - min + 1)) + min;
        return getRandom;
    }

    public static int getRandom2(int min, int max) {
        Random rand = new Random();
        int getRandFromRange = rand.nextInt((max - min) + 1) + min;
        return getRandFromRange;
    }

}







