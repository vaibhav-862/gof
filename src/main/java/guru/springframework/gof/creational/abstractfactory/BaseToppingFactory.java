package guru.springframework.gof.creational.abstractfactory;

import guru.springframework.gof.creational.abstractfactory.topping.Cheese;
import guru.springframework.gof.creational.abstractfactory.topping.Sauce;

public interface BaseToppingFactory {
    Cheese createCheese();
    Sauce createSauce();
}
