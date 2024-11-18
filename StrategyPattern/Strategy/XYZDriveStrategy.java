package StrategyPattern.Strategy;

public class XYZDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("XYZ Drive");
    }
}
