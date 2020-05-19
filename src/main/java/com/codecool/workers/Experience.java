package com.codecool.workers;

public enum Experience {
    BEGINNER(0.6f), MEDIUM(0.7f), EXPERT(0.8f);
    public final float feeToKeepRate;

    Experience(float feeToKeepRate) {
        this.feeToKeepRate = feeToKeepRate;
    }
}
