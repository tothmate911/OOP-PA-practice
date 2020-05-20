package com.codecool.starfleet;

import com.codecool.starfleet.spaceCraft.SpaceStation;

import java.util.Set;

public interface SpaceStationReporter {
    Set<SpaceStation> getAvailableStations();
}
