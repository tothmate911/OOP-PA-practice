package com.codecool.starfleet.spaceCraft.mobileSpaceCraft;

import com.codecool.starfleet.SpaceCraftReporter;
import com.codecool.starfleet.spaceCraft.Dockable;
import com.codecool.starfleet.spaceCraft.SpaceCraft;
import com.codecool.starfleet.spaceCraft.SpaceStation;

import java.util.Set;
import java.util.function.Supplier;

public abstract class MobileSpaceCraft extends SpaceCraft {
    protected int speed;
    private Supplier<Set<SpaceStation>> getAvailableStations;
    private SpaceCraftReporter spaceCraftReporter;

    public MobileSpaceCraft(String name, int yearOfBuilt) {
        super(name, yearOfBuilt);
    }

    public void setAvailableStationsGetter(Supplier<Set<SpaceStation>> getAvailableStations) {
        this.getAvailableStations = getAvailableStations;
    }

    public Set<SpaceStation> getAvailableStations() {
        return getAvailableStations.get();
    }

    public void dock(Dockable dockable) {
        try {
            dockable.dock(this);
            doStuffAfterDocking(dockable);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    protected abstract void doStuffAfterDocking(Dockable dockable);

}
