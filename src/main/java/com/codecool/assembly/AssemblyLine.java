package com.codecool.assembly;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AssemblyLine {
    private List<AssemblyStage> assemblyStages = new ArrayList<>();
    private Map<Component, Integer> componentsUnderConstructionMap = new HashMap<>();
    private Car car;

    public AssemblyLine(int numOfAssemblyStage) {
        for (int i = 0; i < numOfAssemblyStage; i++) {
            this.addAssemblyStage(new AssemblyStage());
        }
    }

    public Car assembleCar() {
        car = new Car();
        while (!car.areAllComponentsFinished()) {
            assembleForASecond();
        }
        return car;
    }

    public void assembleForASecond() {
        for (AssemblyStage assemblyStage : assemblyStages) {
            if (assemblyStage.readyForNewConstruction()) {
                Component componentConstructedByStage = assemblyStage.getComponentBeingConstructed();
                if (componentConstructedByStage != null) {
                    componentsUnderConstructionMap.put(componentConstructedByStage, componentsUnderConstructionMap.get(componentConstructedByStage) - 1);
                    car.addComponent(componentConstructedByStage);
                    assemblyStage.setComponentOfStageNull();
                }
                
                Component nextComponent = whatIsTheNextNeededComponent();
                if (nextComponent != null) {
                    assemblyStage.startConstructing(nextComponent);
                    componentsUnderConstructionMap.put(nextComponent, componentsUnderConstructionMap.getOrDefault(nextComponent, 0) + 1);
                }
            }
            assemblyStage.constructForASecond();            
        }
        System.out.println();
    }


    public Component whatIsTheNextNeededComponent() {
        for (Component component : Car.getComponentsNeededMap().keySet()) {
            int numOfNeededComponent = Car.getComponentsNeededMap().get(component);
            int numOfComponentFinished = car.getComponentsMap().getOrDefault(component, 0);
            int numOfComponentUnderConstruction = componentsUnderConstructionMap.getOrDefault(component, 0);

            if (numOfComponentFinished + numOfComponentUnderConstruction < numOfNeededComponent) {
                return component;
            }
        }
        return null;
    }

    public void addAssemblyStage(AssemblyStage assemblyStage) {
        assemblyStages.add(assemblyStage);
    }

}
