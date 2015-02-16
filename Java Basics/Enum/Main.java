package com.javaweb;

public class Main {

    public enum Days {SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
        THURSDAY, FRIDAY, SATURDAY };

    public enum CardSuit {HEARTS, SPADES, CLUBS, DIAMONDS}

    public static void main(String[] args) {
        CardSuit getClubs = CardSuit.CLUBS;
        if (getClubs == CardSuit.CLUBS) {
            System.out.println("You has chosen CLUBS");
        } else {
            System.out.println("You has chosen something else");
        }

    }

}
