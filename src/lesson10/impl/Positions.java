package lesson10.impl;

import java.util.Scanner;

public enum Positions {

    WORKER ("Worker",1),
    DIRECTOR ("Director", 1.5);

    private String position;
    private double rate;

    Positions(String position, double rate) {
        this.position = position;
        this.rate = rate;
    }

    public String getPosition() {
        return position;
    }

    public double getRate() {
        return rate;
    }
}