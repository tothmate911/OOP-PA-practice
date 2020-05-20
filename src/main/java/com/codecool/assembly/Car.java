package com.codecool.assembly;

import java.util.HashMap;
import java.util.Map;

public class Car {
    private Map<Component, Integer> componentsMap = new HashMap<>();
    private static final Map<Component, Integer> componentsNeededMap = new HashMap<>() {{
        put(Component.ENGINE, 1);
        put(Component.FRAME, 1);
        put(Component.TIRE, 4);
        put(Component.SEATS, 5);
    }};

    public Map<Component, Integer> getComponentsMap() {
        return componentsMap;
    }

    public static Map<Component, Integer> getComponentsNeededMap() {
        return componentsNeededMap;
    }

    public void addComponent(Component component) {
        componentsMap.put(component, componentsMap.getOrDefault(component, 0) + 1);
    }

    public boolean areAllComponentsFinished() {
        for (Component component : componentsNeededMap.keySet()) {
            if (componentsMap.getOrDefault(component, 0) < componentsNeededMap.get(component)) {
                return false;
            }
        }
        return true;
    }

}
