package guru.springframework.gof.creational.abstractfactory;

import guru.springframework.gof.creational.abstractfactory.topping.CaliforniaOilSauce;
import guru.springframework.gof.creational.abstractfactory.topping.Cheese;
import guru.springframework.gof.creational.abstractfactory.topping.GoatCheese;
import guru.springframework.gof.creational.abstractfactory.topping.Sauce;

public class GourmetToppingFactory implements BaseToppingFactory {
    @Override
    public Cheese createCheese() {
        return new GoatCheese();
    }

    @Override
    public Sauce createSauce() {
        return new CaliforniaOilSauce();
    }
}
