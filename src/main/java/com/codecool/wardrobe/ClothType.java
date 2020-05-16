package com.codecool.wardrobe;

public enum ClothType {
    SKIRT(false), TROUSERS(false), BLOUSE(true), SHIRT(true);

    private boolean isUpper;

    private ClothType(boolean isUpper) {
    }
}
