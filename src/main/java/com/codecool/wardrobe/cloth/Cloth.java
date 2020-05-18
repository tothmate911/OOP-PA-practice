package com.codecool.wardrobe.cloth;

public class Cloth implements Cloneable{
    private String brand;
    private ClothType type;
    private int id;
    private static int nextId = 0;

    public Cloth(String brand, ClothType type) {
        this.brand = brand;
        this.type = type;
        id = nextId++;
    }

    public ClothType getType() {
        return type;
    }

    @Override
    public Cloth clone() throws CloneNotSupportedException {
        return (Cloth) super.clone();
    }

    public int getId() {
        return id;
    }
}
