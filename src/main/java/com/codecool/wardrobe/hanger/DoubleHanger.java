package com.codecool.wardrobe.hanger;

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
    protected void putBottomCloth(Cloth cloth) {
       if (bottomCloth == null) {
           bottomCloth = cloth;
           System.out.println("Bottom cloth successfully put on hanger");
       } else {
           System.out.println("There is a bottom cloth already on the Hanger. You cannot put on another.");
       }
    }

    @Override
    protected boolean isPlaceForBottomCloth() {
        return bottomCloth == null;
    }

}
