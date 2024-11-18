package DecoratorPattern;

import DecoratorPattern.Pizza.MargheritaPizza;
import DecoratorPattern.Toppings.ExtraCheese;
import DecoratorPattern.Toppings.Mushroom;

public class Main {

    public static void main(String[] args) {
        int cost = new Mushroom(new ExtraCheese(new MargheritaPizza())).cost();
        System.out.println(cost);
    }

}
