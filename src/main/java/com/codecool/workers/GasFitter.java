package com.codecool.workers;

public class GasFitter extends Worker {
    public GasFitter(String name, Experience experience) {
        super(name, experience);
        this.chanceOfWorkPercentage = 65;
    }
}
