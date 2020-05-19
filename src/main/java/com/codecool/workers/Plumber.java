package com.codecool.workers;

public class Plumber extends Worker {

    public Plumber(String name, Experience experience) {
        super(name, experience);
        this.chanceOfWorkPercentage = 80;
    }
}
