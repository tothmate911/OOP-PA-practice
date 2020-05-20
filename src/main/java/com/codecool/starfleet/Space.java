package com.codecool.starfleet;

import com.codecool.starfleet.spaceCraft.SpaceCraft;
import com.codecool.starfleet.spaceCraft.SpaceStation;
import com.codecool.starfleet.spaceCraft.Type;
import com.codecool.starfleet.spaceCraft.mobileSpaceCraft.MobileSpaceCraft;

import java.util.HashSet;
import java.util.Set;

public class Space implements SpaceCraftReporter, SpaceStationReporter {
    private Set<MobileSpaceCraft> mobileSpaceCrafts = new HashSet<>();
    private Set<SpaceStation> spaceStations = new HashSet<>();

    @Override
    public Set<SpaceStation> getAvailableStations() {
        Set<SpaceStation> availableStations = new HashSet<>();
        for (SpaceStation spaceStation : spaceStations) {
            if (spaceStation.isAvailableDockingSlot()) {
                availableStations.add(spaceStation);
            }
        }
        return availableStations;
    }

    @Override
    public Set<SpaceCraft> getSpaceCrafts(Type type) {
        Set<SpaceCraft> spaceCraftsFiltered = new HashSet<>();
        if (type == Type.SPACE_STATION) {
            spaceCraftsFiltered.addAll(spaceStations);
        } else {
            for (MobileSpaceCraft mobileSpaceCraft : mobileSpaceCrafts) {
                if (mobileSpaceCraft.getType() == type) {
                    spaceCraftsFiltered.add(mobileSpaceCraft);
                }
            }
        }
        return spaceCraftsFiltered;
    }

    public void addSpaceCraft(SpaceStation spaceStation) {
        spaceStations.add(spaceStation);
        spaceStation.setSpaceCraftGetter(this::getSpaceCrafts);
    }

    public void addSpaceCraft(MobileSpaceCraft mobileSpaceCraft) {
        mobileSpaceCrafts.add(mobileSpaceCraft);
        mobileSpaceCraft.setAvailableStationsGetter(this::getAvailableStations);
    }

}

