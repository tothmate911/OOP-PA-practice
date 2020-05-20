package com.codecool.assembly;

public enum Component {
    TIRE(2), SEATS(3), ENGINE(7), FRAME(5);

    public final int timeToConstruct;

    Component(int timeToConstruct) {
        this.timeToConstruct = timeToConstruct;
    }
}
