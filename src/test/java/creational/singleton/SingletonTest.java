package test.java.creational.singleton;

import main.java.creational.singleton.Singleton;
import org.junit.Test;
import static org.junit.Assert.*;

public class SingletonTest {
    @Test
    public void testSingletonInstance() {
        Singleton instance1 = Singleton.getInstance("Value 1");
        Singleton instance2 = Singleton.getInstance("Value 2");

        // Both instances should be the same
        assertSame(instance1.value, instance2.value);
    }
}
