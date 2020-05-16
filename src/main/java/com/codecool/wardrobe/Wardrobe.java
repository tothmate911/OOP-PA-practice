package com.codecool.wardrobe;

import java.util.List;

public class Wardrobe {
    private List<Hanger> hangers;
    private int maxNumOfHangers;

    public Wardrobe(int maxNumOfHangers) {
        this.maxNumOfHangers = maxNumOfHangers;
    }

    public void addHanger(Hanger hanger) {
    }

    public boolean IsPlaceForCloth() {
        return false;
    }

    public Cloth takeCloth(int id) {
        return null;
    }

}
