package guru.springframework.gof.creational.singleton;

public class SingletonClassEagerInit {

    private static final SingletonClassEagerInit INSTANCE = new SingletonClassEagerInit();

    private SingletonClassEagerInit() {

    }

    public static SingletonClassEagerInit getInstance() {
        return INSTANCE;
    }
}
