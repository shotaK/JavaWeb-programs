package com.javaweb;

public class Main {

    public static void main(String[] args) {
        String myStr1 = "\tGood morning";
        myStr1 += "\n Have a  beautiful day";
        System.out.println(myStr1);

        int count = 75;
        String emps = "Number of employees: " + count;
        System.out.println(emps);

        String str = "50";
        int i = Integer.parseInt(str);

        String str1 = "roy";
        if (str1.equals("roy")) {
            System.out.print("Yeah its me.");
        }

        String str2 = "Roy";
        if (str2.equalsIgnoreCase("roy")) {
            System.out.print("Yeah its me again.");
        }
    }
}
