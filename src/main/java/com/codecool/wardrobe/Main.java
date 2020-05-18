package com.codecool.wardrobe;

import com.codecool.wardrobe.cloth.Cloth;
import com.codecool.wardrobe.cloth.ClothType;
import com.codecool.wardrobe.hanger.DoubleHanger;
import com.codecool.wardrobe.hanger.Hanger;
import com.codecool.wardrobe.hanger.SingleHanger;

public class Main {
    public static void main(String[] args) {
        Wardrobe wardrobe = new Wardrobe(2);

        Cloth upperCloth = new Cloth("nike", ClothType.SHIRT);
        Cloth bottomCloth = new Cloth("adidas", ClothType.TROUSERS);

        Hanger hanger = new SingleHanger();
        Hanger doubleHanger = new DoubleHanger();
        DoubleHanger dh = new DoubleHanger();

        hanger.putCloth(upperCloth);
        hanger.putCloth(upperCloth);
        hanger.putCloth(bottomCloth);
        System.out.println();

        doubleHanger.putCloth(upperCloth);
        doubleHanger.putCloth(upperCloth);
        doubleHanger.putCloth(bottomCloth);
        doubleHanger.putCloth(bottomCloth);
        System.out.println();

        wardrobe.addHanger(dh);
        wardrobe.addHanger(hanger);
        wardrobe.addHanger(hanger);

    }

}
