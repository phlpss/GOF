package test.java.creational.singleton;

import main.java.creational.singleton.Singleton;
import org.junit.Test;
import static org.junit.Assert.*;

public class SingletonTest {

    @Test
    public void testSingletonInstance() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        // Both instances should be the same
        assertSame(instance1, instance2);
    }

    @Test
    public void testSingletonMessage() {
        Singleton instance = Singleton.getInstance();
        // We can call methods to ensure they are working, but typically we don't test console output.
        // Instead, we focus on testing the instance behavior and state.
        assertNotNull(instance);
    }
}
