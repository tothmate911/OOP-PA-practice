package com.codecool.wardrobe;

import org.jetbrains.annotations.NotNull;

public class Hanger {
    protected Cloth upperCloth;

    public Cloth takeUpperCloth() throws CloneNotSupportedException {
        Cloth tempCloth = upperCloth.clone();
        upperCloth = null;
        return tempCloth;
    }

    public void putCloth(@NotNull Cloth cloth) throws Exception {
        if (!cloth.getType().isUpper()) {
            throw new Exception("Hanger only accepts upper clothes.\n" +
                    "If you want to put bottom clothes, use DoubleHanger");
        } else if (upperCloth != null) {
            throw new Exception("There is a cloth already on the Hanger.\n" +
                    "You cannot put on another.");
        } else {
            upperCloth = cloth;
        }
    }
}
