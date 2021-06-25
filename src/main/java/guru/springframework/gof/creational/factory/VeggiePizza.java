package guru.springframework.gof.creational.factory;

import guru.springframework.gof.creational.abstractfactory.BaseToppingFactory;

public class VeggiePizza implements Pizza {
    @Override
    public void addIngredients() {
        System.out.println("Preparing Veggie Pizza");
    }
}
