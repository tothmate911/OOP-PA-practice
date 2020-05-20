package com.codecool.scout.troop;

public abstract class Troop {
    private int numOfScout;
    private int twine = 400;
    private int chanceToFindWood;
    private int ChanceToBuild;
    private int chanceToLit;
    private boolean buildingBuilt;

    private int numOfWoodCollection;

    public void build() {
    }

    public boolean collectWood() {
        numOfWoodCollection--;
        return false;
    }

    public void makeCampFire() {
    }

    public void setUpNewDay() {
        numOfWoodCollection = 0;
        buildingBuilt = false;
    }

    public boolean isBuildingBuilt() {
        return buildingBuilt;
    }

}
