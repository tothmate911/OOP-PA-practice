package com.codecool.wardrobe;

import com.codecool.wardrobe.cloth.Cloth;
import com.codecool.wardrobe.cloth.ClothType;
import com.codecool.wardrobe.hanger.Hanger;

import java.util.LinkedList;
import java.util.List;

public class Wardrobe {
    private List<Hanger> hangers = new LinkedList<>();

    private int maxNumOfHangers;

    public Wardrobe(int maxNumOfHangers) {
        this.maxNumOfHangers = maxNumOfHangers;
    }

    public void addHanger(Hanger hanger) {
        if (hangers.size() < maxNumOfHangers) {
            hangers.add(hanger);
            System.out.println("Hanger successfully added");
        } else {
            System.out.println("No more hangers can be put in the wardrobe!");
        }
    }

    public boolean IsPlaceForCloth(ClothType clothType) {
        for (Hanger hanger : hangers) {
            if (hanger.isPlaceForCloth(clothType)) return true;
        }
        return false;
    }

    public Cloth takeCloth(int id) throws CloneNotSupportedException {
        for (Hanger hanger : hangers) {
            if (hanger.getUpperCloth() != null && hanger.getUpperCloth().getId() == id) {
                return hanger.takeUpperCloth();
            } else if (hanger.getBottomCloth() != null && hanger.getBottomCloth().getId() == id) {
                return hanger.takeBottomCloth();
            }
        }
        return null;
    }
}
