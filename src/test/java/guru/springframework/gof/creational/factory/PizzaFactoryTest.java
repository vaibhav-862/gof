package guru.springframework.gof.creational.factory;

import guru.springframework.gof.creational.factory.BasePizzaFactory;
import org.junit.jupiter.api.Test;

class PizzaFactoryTest {

    @Test
    public void testMakePizzas() {
        BasePizzaFactory factory = new PizzaFactory();
        factory.createPizza("cheese");
        factory.createPizza("veggie");
    }
}