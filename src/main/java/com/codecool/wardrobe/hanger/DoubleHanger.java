package com.codecool.wardrobe.hanger;

import com.codecool.wardrobe.cloth.BottomCloth;
import com.codecool.wardrobe.cloth.Cloth;

public class DoubleHanger extends Hanger {

    @Override
    public Cloth getBottomCloth() {
        return bottomCloth;
    }

    @Override
    public Cloth takeBottomCloth() {
        Cloth tempCloth = null;
        try {
            tempCloth = bottomCloth.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        bottomCloth = null;
        return tempCloth;
    }

    @Override
    public void putCloth(BottomCloth bottomCloth) {
        if (this.bottomCloth == null) {
            this.bottomCloth = bottomCloth;
            System.out.println("BottomCloth successfully put on DoubleHhanger");
        } else {
            System.out.println("There is a BottomCloth already on the Hanger. You cannot put on another.");
        }
    }

    @Override
    protected void putBottomCloth(Cloth cloth) {
        if (bottomCloth == null) {
            bottomCloth = cloth;
            System.out.println("Bottom cloth successfully put on DoubleHhanger");
        } else {
            System.out.println("There is a bottom cloth already on the Hanger. You cannot put on another.");
        }
    }

    @Override
    protected boolean isPlaceForBottomCloth() {
        return bottomCloth == null;
    }

    @Override
    public String toString() {
        return "DoubleHanger\n" +
                "\t\tUpperCloth: " + (getUpperCloth() != null ? getUpperCloth().toString() : "") + "\n" +
                "\t\tBottomCloth: " + (getBottomCloth() != null ? getBottomCloth().toString() : "");
    }
}
