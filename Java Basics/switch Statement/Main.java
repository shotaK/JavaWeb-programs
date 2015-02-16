package com.javaweb;

public class Main {

    public static void main(String[] args) {

        int month = 7;

        switch (month) {
            case 1: System.out.print("Jan, ");
            case 2: System.out.print("Feb, ");
            case 3: System.out.print("March, ");
            case 4: System.out.print("April, ");
            case 5: System.out.print("May, ");
            case 6: System.out.print("June, ");
            case 7: System.out.print("July, ");
            case 8: System.out.print("August, ");
            case 9: System.out.print("Sep, ");
            case 10: System.out.print("Oct, ");
            case 11: System.out.print("Nov, "); break;
            case 12: System.out.print("Dec, ");
            default: System.out.print("This is the end of year.");
        }

        char grade = 'C';

        switch (grade) {
            case 'A': System.out.print("Perfect"); break;
            case 'B':case 'C':
                if (grade == 'B') {
                    System.out.print("Good job");
                } else {
                    System.out.print("not bad");
                } break;
            case 'D': System.out.print("You still passed"); break;
            default: System.out.print("Your grade is pending");

        }

        String monthStr = "april";
        int monthNumber;

        switch (monthStr.toLowerCase()) {
            case "january": System.out.print(monthNumber = 1); break;
            case "february": System.out.print(monthNumber = 2); break;
            case "march": System.out.print(monthNumber = 3); break;
            case "april": System.out.print(monthNumber = 4); break;
            case "may": System.out.print(monthNumber = 5); break;
            case "june": System.out.print(monthNumber = 6); break;
            case "july": System.out.print(monthNumber = 7); break;
            case "august": System.out.print(monthNumber = 8); break;
            case "september": System.out.print(monthNumber = 9); break;
            case "october": System.out.print(monthNumber = 10);break;
            case "november": System.out.print(monthNumber = 11);break;
            case "december": System.out.print(monthNumber = 12);break;
            default: System.out.print(monthNumber = 0); break;
        }

    }

}

