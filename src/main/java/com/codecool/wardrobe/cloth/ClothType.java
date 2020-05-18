package com.codecool.wardrobe.cloth;

public enum ClothType {
    SHIRT(true), BLOUSE(true), TROUSERS(false), SKIRT(false);

    public final boolean isUpper;

    private ClothType(boolean isUpper) {
        this.isUpper = isUpper;
    }
}
