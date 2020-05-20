package com.codecool.starfleet.spaceCraft.mobileSpaceCraft;

import com.codecool.starfleet.Util;
import com.codecool.starfleet.spaceCraft.Dockable;
import com.codecool.starfleet.spaceCraft.Type;

import java.util.HashMap;

public class CargoShip extends MobileSpaceCraft {
    private static final int SPEED = 150;
    private java.util.Map<Cargo, Integer> cargoMap = new HashMap<>();

    public CargoShip(String name, int yearOfBuilt) {
        super(name, yearOfBuilt);
        this.type = Type.CARGO_SHIP;
        this.speed = SPEED;
        setUpCargo();
    }

    private void setUpCargo() {
        cargoMap.put(Cargo.FOOD, Util.getRandomNumberOfPiece());
        cargoMap.put(Cargo.MEDICINE, Util.getRandomNumberOfPiece());
        cargoMap.put(Cargo.WEAPON, Util.getRandomNumberOfPiece());
    }

    @Override
    protected void doStuffAfterDocking(Dockable dockable) {
        System.out.println(name + " " + registrationCode);
        for (Cargo cargo : cargoMap.keySet()) {
            System.out.println("\t" + cargo + " " + cargoMap.get(cargo));
        }
        pickupNewShipment();
    }

    private void pickupNewShipment() {
        Cargo typeToPickUp = Util.getRandomType();
        cargoMap.put(typeToPickUp, cargoMap.get(typeToPickUp) + 1);
    }

}
