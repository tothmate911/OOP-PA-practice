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

        hanger.putCloth(upperCloth);
        hanger.putCloth(upperCloth);
        hanger.putCloth(bottomCloth);
        System.out.println();

        doubleHanger.putCloth(upperCloth);
        doubleHanger.putCloth(upperCloth);
        doubleHanger.putCloth(bottomCloth);
        doubleHanger.putCloth(bottomCloth);
        System.out.println();

        wardrobe.addHanger(hanger);
        wardrobe.addHanger(doubleHanger);
        wardrobe.addHanger(doubleHanger);
        System.out.println();

        System.out.println(wardrobe);
        System.out.println(wardrobe.IsPlaceForCloth(ClothType.SHIRT));
        System.out.println();

        Cloth takenCloth = wardrobe.takeCloth(2);
        takenCloth = wardrobe.takeCloth(0);
        System.out.println(wardrobe);
        System.out.println(wardrobe.IsPlaceForCloth(ClothType.SHIRT));



    }

}
