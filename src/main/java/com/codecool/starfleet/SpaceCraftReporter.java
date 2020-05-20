package com.codecool.starfleet;

import com.codecool.starfleet.spaceCraft.SpaceCraft;
import com.codecool.starfleet.spaceCraft.Type;

import java.util.Set;

public interface SpaceCraftReporter {
    Set<SpaceCraft> getSpaceCrafts(Type type);
}
