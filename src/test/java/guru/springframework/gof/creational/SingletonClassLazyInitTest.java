package guru.springframework.gof.creational;

import guru.springframework.gof.creational.singleton.SingletonClassLazyInit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonClassLazyInitTest {

    @Test
    public void testLazySingleton() {
        SingletonClassLazyInit instance1 = SingletonClassLazyInit.getInstance();
        SingletonClassLazyInit instance2 = SingletonClassLazyInit.getInstance();

        assertTrue(instance1 == instance2,
                "Diff objects, instance1 : " + instance1.hashCode() + ", instance2 : " + instance2.hashCode());
    }

}