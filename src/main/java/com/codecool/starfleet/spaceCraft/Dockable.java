package com.codecool.starfleet.spaceCraft;

import com.codecool.starfleet.spaceCraft.mobileSpaceCraft.MobileSpaceCraft;

public interface Dockable {
    boolean isAvailableDockingSlot();
    void dock(MobileSpaceCraft mobileSpaceCraft) throws Exception;
    String getRegistrationCode();
}
