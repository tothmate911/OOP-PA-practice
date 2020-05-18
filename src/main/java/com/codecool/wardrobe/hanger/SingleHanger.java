package com.codecool.wardrobe.hanger;

import com.codecool.wardrobe.cloth.Cloth;

public class SingleHanger extends Hanger {
    @Override
    public Cloth getBottomCloth() {
        return null;
    }

    @Override
    public Cloth takeBottomCloth() {
        return null;
    }

    @Override
    protected void putBottomCloth(Cloth cloth) {
        System.out.println("Hanger only accepts upper clothes. If you want to put bottom clothes, use DoubleHanger");
    }

    @Override
    protected boolean isPlaceForBottomCloth() {
        return false;
    }

}
