package guru.springframework.gof.creational.factory;

public class PizzaFactory implements BasePizzaFactory {
    @Override
    public Pizza createPizza(String pizzaType) {
        Pizza pizza;

        switch(pizzaType) {
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "veggie":
                pizza = new VeggiePizza();
                break;
            case "pepperoni":
                pizza = new PepperoniPizza();
            default:
                throw new IllegalArgumentException("No such pizza");
        }

        pizza.addIngredients();
        return pizza;
    }
}
