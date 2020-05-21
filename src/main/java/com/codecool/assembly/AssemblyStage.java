package com.codecool.assembly;

public class AssemblyStage {
    private int secondsLeftUntilConstructionFinished;
    private Component componentBeingConstructed;
    private int id;
    private static int nextId = 1;

    public AssemblyStage() {
        id = nextId++;
    }

    public void startConstructing(Component component) {
        componentBeingConstructed = component;
        secondsLeftUntilConstructionFinished = component.timeToConstruct;
        System.out.println(id + " Started to construct " + component);
    }

    public void constructForASecond() {
        if (componentBeingConstructed != null) {
            System.out.println(id + " Constructing " + componentBeingConstructed + ", secondsLeft: " + secondsLeftUntilConstructionFinished);
            if (--secondsLeftUntilConstructionFinished == 0) {
                System.out.println("\tFinished " + componentBeingConstructed);
            }
        } else {
            System.out.println(id + " Nothing to construct");
        }
    }

    public void setComponentOfStageNull() {
        componentBeingConstructed = null;
    }

    public boolean readyForNewConstruction() {
        return componentBeingConstructed == null || secondsLeftUntilConstructionFinished == 0;
    }

    public Component getComponentBeingConstructed() {
        return componentBeingConstructed;
    }
}
