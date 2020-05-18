package com.codecool.wardrobe.hanger;

import com.codecool.wardrobe.cloth.Cloth;
import com.codecool.wardrobe.cloth.ClothType;

public abstract class Hanger {
    private Cloth upperCloth;
    protected Cloth bottomCloth;

    public Cloth getUpperCloth() {
        return upperCloth;
    }

    public abstract Cloth getBottomCloth();

    public Cloth takeUpperCloth() {
        Cloth tempCloth = null;
        try {
            tempCloth = upperCloth.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        upperCloth = null;
        return tempCloth;
    }

    public abstract Cloth takeBottomCloth();

    public void putCloth(Cloth cloth) {
        if (cloth.getType().isUpper) {
            putUpperCloth(cloth);
        } else {
            putBottomCloth(cloth);
        }
    }

    private void putUpperCloth(Cloth cloth) {
        if (upperCloth == null) {
            upperCloth = cloth;
            System.out.println("Cloth successfully put on hanger");
        } else {
            System.out.println("There is an upper cloth already on the Hanger. You cannot put on another.");
        }
    }

    protected abstract void putBottomCloth(Cloth cloth);

    public boolean isPlaceForCloth(ClothType clothType) {
        if (clothType.isUpper) {
            return isPlaceForUpperCloth();
        } else {
            return isPlaceForBottomCloth();
        }
    }

    protected boolean isPlaceForUpperCloth() {
        return upperCloth == null;
    }

    protected abstract boolean isPlaceForBottomCloth();
}