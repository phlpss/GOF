package test.java.creational;

import main.java.creational.abstractFactory.factory.FurnitureAbstractFactory;
import main.java.creational.abstractFactory.factory.LoftFurnitureFactory;
import main.java.creational.abstractFactory.factory.ModernFurnitureFactory;
import main.java.creational.abstractFactory.product.*;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;

public class AbstractFactoryTest {

    @Test
    public void testLoftFurnitureCreator() {
        FurnitureAbstractFactory factory = new LoftFurnitureFactory();
        Chair chair = factory.createChair();
        Table table = factory.createTable();

        assertNotNull("Chair should not be null", chair);
        assertNotNull("Table should not be null", table);
        assertEquals("Chair type should be 'Loft Chair'", "Loft Chair", chair.getType());
        assertEquals("Table type should be 'Loft Table'", "Loft Table", table.getType());
        assertTrue("Chair should be an instance of LoftChair", chair instanceof LoftChair);
        assertTrue("Table should be an instance of LoftTable", table instanceof LoftTable);
    }

    @Test
    public void testModernFurnitureCreator() {
        FurnitureAbstractFactory factory = new ModernFurnitureFactory();
        Chair chair = factory.createChair();
        Table table = factory.createTable();

        assertNotNull("Chair should not be null", chair);
        assertNotNull("Table should not be null", table);
        assertEquals("Chair type should be 'Modern Chair'", "Modern Chair", chair.getType());
        assertEquals("Table type should be 'Modern Table'", "Modern Table", table.getType());
        assertTrue("Chair should be an instance of ModernChair", chair instanceof ModernChair);
        assertTrue("Table should be an instance of ModernTable", table instanceof ModernTable);
    }
}