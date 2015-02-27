package com.javaweb;

public interface Playable {
    void play();
    default void quit() {
        System.out.println("quitting finished successfully.");
    }
}
