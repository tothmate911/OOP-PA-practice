package com.codecool.starfleet.spaceCraft.mobileSpaceCraft;

import com.codecool.starfleet.spaceCraft.Dockable;
import com.codecool.starfleet.spaceCraft.SpaceCraft;
import com.codecool.starfleet.spaceCraft.Type;

import java.time.LocalDate;

public class DiscoveryShip extends MobileSpaceCraft {
    public static final int AVG_SPEED = 450;

    public DiscoveryShip(String name, int yearOfBuilt) {
        super(name, yearOfBuilt);
        this.type = Type.DISCOVERY_SHIP;
        this.speed = calculateSpeed();
    }

    private int calculateSpeed() {
        int actualSpeed = AVG_SPEED;
        if (yearOfBuilt < 2150) {
            actualSpeed -= 30;
        }
        if (yearOfBuilt > 2200) {
            actualSpeed += 15;
        }
        return actualSpeed;
    }

    @Override
    protected void doStuffAfterDocking(Dockable dockable) {
        System.out.println(LocalDate.now() + " " + dockable.getRegistrationCode());
    }

}
