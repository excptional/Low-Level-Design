package StrategyPattern;

import StrategyPattern.Strategy.DriveStrategy;

public class Vehicle {

    DriveStrategy obj;

    public Vehicle(DriveStrategy obj) {
        this.obj = obj;
    }

    void drive() {
        obj.drive();
    }

}
