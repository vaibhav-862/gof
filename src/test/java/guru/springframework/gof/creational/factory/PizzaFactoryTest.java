package guru.springframework.gof.creational.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaFactoryTest {

    @Test
    public void testMakePizzas() {
        BasePizzaFactory factory = new PizzaFactory();
        factory.createPizza("cheese");
        factory.createPizza("veggie");
    }
}