package guru.springframework.gof.creational.factory;

import guru.springframework.gof.creational.abstractfactory.BaseToppingFactory;

public class PepperoniPizza implements Pizza {
    @Override
    public void addIngredients() {
        System.out.println("Preparing Pepperoni Pizza");
    }
}
