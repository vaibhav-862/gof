package guru.springframework.gof.creational.abstractfactory;

import guru.springframework.gof.creational.abstractfactory.product.Pizza;

public interface BasePizzaFactory {
    public Pizza createPizza(String pizzaType);
}
