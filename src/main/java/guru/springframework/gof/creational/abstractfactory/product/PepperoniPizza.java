package guru.springframework.gof.creational.abstractfactory.product;

import guru.springframework.gof.creational.abstractfactory.BaseToppingFactory;

public class PepperoniPizza implements Pizza {
    private BaseToppingFactory toppingFactory;

    public PepperoniPizza(BaseToppingFactory toppingFactory) {
        this.toppingFactory = toppingFactory;
    }

    @Override
    public void createPizza() {
        System.out.println("Preparing ingredients for Pepperoni Pizza");
        toppingFactory.createCheese();
        toppingFactory.createSauce();
    }
}
