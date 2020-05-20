package com.codecool.scout;

import com.codecool.scout.troop.Troop;

import java.util.HashSet;
import java.util.Set;

public class Camp {
    private Set<Troop> troops = new HashSet<>();
    private Troop winnerTroop;
    private Set<Troop> winners = new HashSet<>();

    public void addTroop(Troop troop) {
        troops.add(troop);
    }

    public void simulateTenDays() {
        for (int i = 0; i < 10; i++) {
            simulateADay();
        }
    }

    public void simulateADay() {
        for (Troop troop : troops) {
            troop.setUpNewDay();
        }
        while (winnerTroop == null) {
            simulateAPhase();
        }
        litCampFire(winnerTroop);
        winners.add(winnerTroop);
        winnerTroop = null;
    }

    public void simulateAPhase() {
        for (Troop troop : troops) {
            troop.simulateADay();
            if (troop.isBuildingBuilt()) {
                winnerTroop = troop;
                break;
            }
        }
    }

    public void litCampFire(Troop troop) {
    }
}
