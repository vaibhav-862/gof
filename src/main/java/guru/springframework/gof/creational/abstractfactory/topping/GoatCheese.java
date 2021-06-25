package guru.springframework.gof.creational.abstractfactory.topping;

public class GoatCheese implements Cheese {

    public GoatCheese() {
        prepareCheese();
    }

    @Override
    public void prepareCheese() {
        System.out.println("Preparing Goat Cheese");
    }
}
