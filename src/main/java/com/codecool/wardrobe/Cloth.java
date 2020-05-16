package com.codecool.wardrobe;

public class Cloth {
    private String brand;
    private ClothType type;
    private int id;
    private static int nextId = 0;

    public Cloth(String brand, ClothType type) {
        this.brand = brand;
        this.type = type;
        id = nextId++;
    }
}
