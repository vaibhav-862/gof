package guru.springframework.gof.creational.abstractfactory.topping;

public class TomatoSauce implements Sauce {

    public TomatoSauce() {
        prepareSauce();
    }

    @Override
    public void prepareSauce() {
        System.out.println("Preparing Tomato Sauce");
    }
}
