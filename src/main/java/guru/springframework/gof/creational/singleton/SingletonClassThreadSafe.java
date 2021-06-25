package guru.springframework.gof.creational.singleton;

public class SingletonClassThreadSafe {

    private static SingletonClassThreadSafe instance = null;

    private SingletonClassThreadSafe() {

    }

    public synchronized static SingletonClassThreadSafe getInstance() {
        if(instance == null) {
            instance = new SingletonClassThreadSafe();
        }
        return instance;
    }
}
