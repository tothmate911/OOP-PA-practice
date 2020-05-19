package com.codecool.workers;

public class Electrician extends Worker {

    public Electrician(String name, Experience experience) {
        super(name, experience);
        this.chanceOfWorkPercentage = 90;
    }
}
