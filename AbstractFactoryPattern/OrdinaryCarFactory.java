package AbstractFactoryPattern;

public class OrdinaryCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Hyundai();
    }
}
