package guru.springframework.gof.creational.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbstractFactoryTest {

    @Test
    public void testCreatePizza() {
        BasePizzaFactory sicilianFactory = new SicilianPizzaFactory();
        sicilianFactory.createPizza("cheese");

        BasePizzaFactory gourmetFactory = new GourmetPizzaFactory();
        gourmetFactory.createPizza("pepperoni");
    }

}