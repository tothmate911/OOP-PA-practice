package com.codecool.assembly;

public class AssemblyStage {
    private int secondsLeftUntilConstructionFinished;
    private Component componentBeingConstructed;

    public void startConstructing(Component component) {
        componentBeingConstructed = component;
        secondsLeftUntilConstructionFinished = component.timeToConstruct;
        System.out.println("Started to construct " + component);
    }

    public void constructForASecond() {
        if (componentBeingConstructed != null) {
            System.out.println("Constructing " + componentBeingConstructed + ", secondsLeft: " + secondsLeftUntilConstructionFinished);
        } else {
            System.out.println("Nothing to construct");
        }
        if (secondsLeftUntilConstructionFinished > 0) secondsLeftUntilConstructionFinished--;
    }

    public boolean readyForNewConstruction() {
        return componentBeingConstructed == null || secondsLeftUntilConstructionFinished == 0;
    }

    public Component getComponentBeingConstructed() {
        return componentBeingConstructed;
    }
}
