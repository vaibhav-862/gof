package guru.springframework.gof.creational.abstractfactory;

import guru.springframework.gof.creational.abstractfactory.topping.Cheese;
import guru.springframework.gof.creational.abstractfactory.topping.MozzarellaCheese;
import guru.springframework.gof.creational.abstractfactory.topping.Sauce;
import guru.springframework.gof.creational.abstractfactory.topping.TomatoSauce;

public class SicilianToppingFactory implements BaseToppingFactory {
    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Sauce createSauce() {
        return new TomatoSauce();
    }
}
