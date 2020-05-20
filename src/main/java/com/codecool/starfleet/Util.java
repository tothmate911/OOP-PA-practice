package com.codecool.starfleet;

import com.codecool.starfleet.spaceCraft.Type;
import com.codecool.starfleet.spaceCraft.mobileSpaceCraft.Cargo;

import java.util.Random;

public class Util {
    private static final Random RANDOM = new Random();
    private static final int MAX_NUM_OF_PIECES = 5;

    public static int getRandomNumberOfPiece() {
        return RANDOM.nextInt(MAX_NUM_OF_PIECES + 1);
    }

    public static Cargo getRandomType() {
        int randomOrdinal = RANDOM.nextInt(Cargo.values().length);
        return Cargo.values()[randomOrdinal];
    }
}
