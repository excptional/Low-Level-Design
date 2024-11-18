package AbstractFactoryPattern;

public class RollsRoyce implements Car {
    @Override
    public void start() {
        System.out.println("RollsRoyce start");
    }

    @Override
    public void accelerate() {
        System.out.println("RollsRoyce accelerate");
    }

    @Override
    public void stop() {
        System.out.println("RollsRoyce stop");
    }
}
