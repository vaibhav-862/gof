package guru.springframework.gof.creational.factory;

public class VeggiePizza implements Pizza {
    @Override
    public void addIngredients() {
        System.out.println("Preparing Veggie Pizza");
    }
}
