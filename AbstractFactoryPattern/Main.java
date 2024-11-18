package AbstractFactoryPattern;

public class Main {

    public static void main(String[] args) {
        CarFactory carFactory1 = new LuxuryCarFactory();
        CarFactory carFactory2 = new OrdinaryCarFactory();

        carFactory1.createCar().start();
        carFactory2.createCar().accelerate();
    }

}
