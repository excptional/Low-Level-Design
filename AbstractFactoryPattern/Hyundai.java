package AbstractFactoryPattern;

public class Hyundai implements Car {
    @Override
    public void start() {
        System.out.println("Hyundai start");
    }

    @Override
    public void accelerate() {
        System.out.println("Hyundai accelerate");
    }

    @Override
    public void stop() {
        System.out.println("Hyundai stop");
    }
}
