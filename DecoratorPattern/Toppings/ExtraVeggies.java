package DecoratorPattern.Toppings;

import DecoratorPattern.Pizza.BasePizza;

public class ExtraVeggies extends Toppings {

    BasePizza pizza;

    public ExtraVeggies(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return pizza.cost() + 20;
    }
}
