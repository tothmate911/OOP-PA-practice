package com.codecool.workers;

public class Util {
    public static int getRandom(int min, int max) {
        return (int) ((Math.random() * (max - min) + 1)) + min;
    }
}
