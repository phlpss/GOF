package test.java.creational;

import main.java.creational.factoryMethod.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class FactoryMethodTest {
    @Test
    public void testCarCreator() {
        Creator creator = new CarCreator();
        Transport transport = creator.createTransport();

        assertNotNull("Transport should not be null", transport);
        assertTrue("Transport should be a Car", transport instanceof Car);
        assertEquals("Car gives a ride", transport.giveRide());
    }

    @Test
    public void testBikeCreator() {
        Creator creator = new BikeCreator();
        Transport transport = creator.createTransport();

        assertNotNull("Transport should not be null", transport);
        assertTrue("Transport should be a Bike", transport instanceof Bike);
        assertEquals("Bike gives a ride", transport.giveRide());
    }
}