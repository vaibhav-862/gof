package guru.springframework.gof.creational.factory;

public class PepperoniPizza implements Pizza {
    @Override
    public void addIngredients() {
        System.out.println("Preparing Pepperoni Pizza");
    }
}
