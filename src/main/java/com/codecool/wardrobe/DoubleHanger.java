package com.codecool.wardrobe;

import org.jetbrains.annotations.NotNull;

public class DoubleHanger extends Hanger {
    private Cloth bottomCloth;

    public Cloth takeBottomCloth() {
        return null;
    }

    @Override
    public void putCloth(@NotNull Cloth cloth) throws Exception {
        if (cloth.getType().isUpper() && upperCloth == null) {
            upperCloth = cloth;
        } else if (!cloth.getType().isUpper() && bottomCloth == null) {
            bottomCloth = cloth;
        } else {
            throw new Exception("There is already a cloth of the given type");
        }
    }

}
