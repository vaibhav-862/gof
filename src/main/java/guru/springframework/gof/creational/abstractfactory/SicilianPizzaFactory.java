package guru.springframework.gof.creational.abstractfactory;


import guru.springframework.gof.creational.abstractfactory.product.CheesePizza;
import guru.springframework.gof.creational.abstractfactory.product.PepperoniPizza;
import guru.springframework.gof.creational.abstractfactory.product.Pizza;
import guru.springframework.gof.creational.abstractfactory.product.VeggiePizza;

public class SicilianPizzaFactory implements BasePizzaFactory {

    @Override
    public Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        BaseToppingFactory toppingFactory = new SicilianToppingFactory();

        switch(pizzaType.toLowerCase()) {
            case "cheese":
                pizza = new CheesePizza(toppingFactory);
                break;
            case "veggie":
                pizza = new VeggiePizza(toppingFactory);
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(toppingFactory);
                break;
            default:
                throw new IllegalArgumentException("No such pizza");
        }

        pizza.createPizza();
        return pizza;
    }
}
