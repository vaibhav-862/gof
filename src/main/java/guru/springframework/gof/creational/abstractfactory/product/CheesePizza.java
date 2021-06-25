package guru.springframework.gof.creational.abstractfactory.product;

import guru.springframework.gof.creational.abstractfactory.BaseToppingFactory;

public class CheesePizza implements Pizza {
    private BaseToppingFactory toppingFactory;

    public CheesePizza(BaseToppingFactory toppingFactory) {
        this.toppingFactory = toppingFactory;
    }

    @Override
    public void createPizza() {
        System.out.println("Preparing ingredients for Cheese Pizza");
        toppingFactory.createCheese();
        toppingFactory.createSauce();
    }
}
