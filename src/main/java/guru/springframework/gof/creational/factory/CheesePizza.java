package guru.springframework.gof.creational.factory;

import guru.springframework.gof.creational.abstractfactory.BaseToppingFactory;

public class CheesePizza implements Pizza {
    @Override
    public void addIngredients() {
        System.out.println("Preparing Cheese Pizza");
    }
}
