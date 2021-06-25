package guru.springframework.gof.creational.factory;

public class CheesePizza implements Pizza {
    @Override
    public void addIngredients() {
        System.out.println("Preparing Cheese Pizza");
    }
}
