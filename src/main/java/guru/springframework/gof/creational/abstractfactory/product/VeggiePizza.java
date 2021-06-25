package guru.springframework.gof.creational.abstractfactory.product;

import guru.springframework.gof.creational.abstractfactory.BaseToppingFactory;

public class VeggiePizza implements Pizza {

    private BaseToppingFactory toppingFactory;

    public VeggiePizza(BaseToppingFactory toppingFactory) {
        this.toppingFactory = toppingFactory;
    }


    @Override
    public void createPizza() {
        System.out.println("Preparing ingredients for Veggie Pizza");
        toppingFactory.createCheese();
        toppingFactory.createSauce();
    }
}
