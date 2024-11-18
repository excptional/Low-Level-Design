package StrategyPattern;

import StrategyPattern.Strategy.DriveStrategy;
import StrategyPattern.Strategy.NormalDriveStrategy;

public class PublicVehicle extends Vehicle{
    public PublicVehicle() {
        super(new NormalDriveStrategy());
    }
}
