package com.javaweb;

public class Main {

    public static void main(String[] args) {
        String[] arrayName;

        int[] array1;
        int array2[];

        String arrayName1[] = new String[10];

        String Days[] = new String[7];
        Days[0] = "Sunday";
        Days[1] = "Monday";
        Days[2] = "Tuesday";
        Days[3] = "Wednesday";
        Days[4] = "Thursday";
        Days[5] = "Friday";
        Days[6] = "Saturday";

        String[] Days3 = {"Sunday", "Monday", "Tuesday"};

        int[] myInt = new int[] {2, 3, 6, 56, 23};

        int[] count = new int[100];
        for (int i = 0; i < count.length; i++) {
            count[i] = (int) (i * Math.random()) + 1;
        }

        for (int i = 0; i < Days3.length; i++) {
            System.out.print(Days3[i] + " ");
        }

        String[] getDaysArray = getDaysOfWeek();
        printStringArray(getDaysArray);
    }

    public static String[] getDaysOfWeek() {
        String[] Days2 = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        return Days2;
    }

    public static void printStringArray(String[] daysArray) {
        for (String day : daysArray) {
            System.out.println(day);
        }
    }
}




