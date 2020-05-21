package com.codecool.kidsCamp;

public class CampDirector extends BigLeader implements DirectorReportAccepter {
    private Camp camp;

    @Override
    public void reportToDirector(Color color, int numOfPoints) {
    }

    public void setCamp(Camp camp) {
        this.camp = camp;
    }
}
