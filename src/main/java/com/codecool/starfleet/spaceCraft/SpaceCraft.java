package com.codecool.starfleet.spaceCraft;

import java.util.UUID;

public abstract class SpaceCraft {
    protected String registrationCode;
    protected String name;
    protected int yearOfBuilt;
    protected Type type;

    public SpaceCraft(String name, int yearOfBuilt) {
        this.name = name;
        this.yearOfBuilt = yearOfBuilt;
        registrationCode = UUID.randomUUID().toString();
    }

    public Type getType() {
        return type;
    }

    public String getRegistrationCode() {
        return registrationCode;
    }
}
