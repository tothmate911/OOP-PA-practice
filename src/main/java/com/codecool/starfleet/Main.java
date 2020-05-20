package com.codecool.starfleet;

import com.codecool.starfleet.spaceCraft.SpaceStation;
import com.codecool.starfleet.spaceCraft.Type;
import com.codecool.starfleet.spaceCraft.mobileSpaceCraft.CargoShip;
import com.codecool.starfleet.spaceCraft.mobileSpaceCraft.DiscoveryShip;
import com.codecool.starfleet.spaceCraft.mobileSpaceCraft.MobileSpaceCraft;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Space space = new Space();
        SpaceStation spaceStation = new SpaceStation("ss1", 2000);
        space.addSpaceCraft(spaceStation);

        MobileSpaceCraft cargo = new CargoShip("cargo ship", 3000);
        space.addSpaceCraft(cargo);

        MobileSpaceCraft discovery1 = new DiscoveryShip("discovery1 ship", 3000);
        space.addSpaceCraft(discovery1);
        MobileSpaceCraft discovery2 = new DiscoveryShip("discovery2 ship", 10000);
        space.addSpaceCraft(discovery2);

        System.out.println(spaceStation.getSpaceCrafts(Type.DISCOVERY_SHIP));

        System.out.println(discovery1.getAvailableStations());

        discovery1.dock(spaceStation);
//        discovery2.dock(spaceStation);

        cargo.dock(spaceStation);

    }
}
