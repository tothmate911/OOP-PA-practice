package com.codecool.starfleet.spaceCraft;

import com.codecool.starfleet.spaceCraft.mobileSpaceCraft.MobileSpaceCraft;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

public class SpaceStation extends SpaceCraft implements Dockable {
    private Set<MobileSpaceCraft> dock = new HashSet<>();
    private static final int MAX_DOCKING_SLOT_NUM = 2;
    private Function<Type, Set<SpaceCraft>> getSpaceCrafts;

    public SpaceStation(String name, int yearOfBuilt) {
        super(name, yearOfBuilt);
        this.type = Type.SPACE_STATION;
    }

    public void setSpaceCraftGetter(Function<Type, Set<SpaceCraft>> getSpaceCrafts) {
        this.getSpaceCrafts = getSpaceCrafts;
    }

    public Set<SpaceCraft> getSpaceCrafts(Type type) {
        return getSpaceCrafts.apply(type);
    }

    @Override
    public boolean isAvailableDockingSlot() {
        return dock.size() < MAX_DOCKING_SLOT_NUM;
    }

    @Override
    public void dock(MobileSpaceCraft mobileSpaceCraft) throws Exception {
        if (!isAvailableDockingSlot()) {
            throw new Exception("The dock is already full");
        } else {
            dock.add(mobileSpaceCraft);
        }

    }

}
