package guru.springframework.gof.creational.abstractfactory.topping;

public class MozzarellaCheese implements Cheese {

    public MozzarellaCheese() {
        prepareCheese();
    }

    @Override
    public void prepareCheese() {
        System.out.println("Preparing Mozzarella Cheese");
    }
}
