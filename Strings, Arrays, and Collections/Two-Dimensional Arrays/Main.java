package com.javaweb;

public class Main {

    public static void main(String[] args) {
        double sales[][];
        sales = new double[5][4];
        int amout[][] = new int[10][25];

        sales[0][0] = 2345.0;

        double[][] sales1 = {
                {23853.0, 22838.0, 36483.0, 31352.0}, // 2004
                {25483.0, 22943.0, 38274.0, 33294.0}, // 2005
                {24872.0, 23049.0, 39002.0, 36888.0}, // 2006
                {28492.0, 23784.0, 42374.0, 39573.0}, // 2007
                {31932.0, 23732.0, 42943.0, 41734.0}, // 2008
        };
        System.out.println("\t\tNorth\tSouth\tEast\tWest");
        int initialYear = 2004;
        for (int i = 0; i < sales1.length; i++) {
            System.out.print(initialYear + "\t");
            for (int j = 0; j < sales1[i].length; j++) {
                System.out.print(sales1[i][j]);
                System.out.print("\t");
            }
            System.out.println();
            initialYear++;
        }

        String[][] teams = {
                {"Henry Blake", "Johnny Mulcahy"},
                {"Benjamin Pierce", "John McIntyre", "Jonathan Tuttle"},
                {"Margaret Houlihan", "Frank Burns"},
                {"Max Klinger", "Radar O'Reilly", "Igor Straminsky"}
        };

        for (int i = 0; i < teams.length; i++) {
            for (int j = 0; j < teams[i].length; j++) {
                System.out.print("\t" + teams[i][j] + ", ");
            }
            System.out.println();
        }

        for (String[] teamsAr : teams) {
            for (String team : teamsAr) {
                System.out.print("\t" + team + ", ");
            }
            System.out.println();
        }

        int threeDim[][][] = new int[3][8][2];
        int[][][] threeD =
                { { {1, 2, 3}, { 4, 5, 6}, { 7, 8, 9} },
                { {10, 11, 12}, {13, 14, 15}, {16, 17, 18} },
                { {19, 20, 21}, {22, 23, 24}, {25, 26, 27} },
        };

        for (int i = 0; i < threeD.length; i++) {
            for (int j = 0; j < threeD[i].length; j++) {
                for (int k = 0; k < threeD[i][j].length; k++) {
                    System.out.print(" " + threeD[i][j][k]);
                }
                System.out.print(", ");
            }
            System.out.println();
        }

    }

}




