package DecoratorPattern.Toppings;

import DecoratorPattern.Pizza.BasePizza;

public class ExtraCheese extends Toppings {

    BasePizza pizza;

    public ExtraCheese(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return pizza.cost() + 30;
    }
}
