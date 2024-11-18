package DecoratorPattern.Toppings;

import DecoratorPattern.Pizza.BasePizza;

public class Mushroom extends Toppings {

    BasePizza pizza;

    public Mushroom(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return pizza.cost() + 50;
    }
}
