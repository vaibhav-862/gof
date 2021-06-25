package guru.springframework.gof.creational.abstractfactory.topping;

public class CaliforniaOilSauce implements Sauce {

    public CaliforniaOilSauce() {
        prepareSauce();
    }

    @Override
    public void prepareSauce() {
        System.out.println("Preparing CaliforniaOil Sauce");
    }
}
