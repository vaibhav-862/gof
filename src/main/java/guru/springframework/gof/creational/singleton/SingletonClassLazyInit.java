package guru.springframework.gof.creational.singleton;

public class SingletonClassLazyInit {

    private static SingletonClassLazyInit instance = null;

    private SingletonClassLazyInit() {

    }

    public static SingletonClassLazyInit getInstance() {
        if(instance == null)
            instance = new SingletonClassLazyInit();
        return instance;
    }
}
