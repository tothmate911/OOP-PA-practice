package com.codecool.kidsCamp;

import java.util.HashSet;
import java.util.Set;

public class Group implements HouseInspectionReporter, PointAdder {
    private BigLeader bigLeader;
    private Set<SmallLeader> smallLeaders = new HashSet<>();
    private Set<Child> children = new HashSet<>();
    private Color color;
    private int points;
    private int numOfTidyBeds;

    public void addPersonToGroup(Child child) {
    }

    public void addPersonToGroup(BigLeader bigLeader) {
    }

    public void addPersonToGroup(SmallLeader smallLeader) {
    }

    @Override
    public int getNumOfTidyBeds() {
        return 0;
    }

    @Override
    public int getNumberOfChildren() {
        return 0;
    }

    public void clean() {
    }

    public void simulateAMorning() {
    }

    @Override
    public void addPoints(int numOfPoints) {

    }
}
