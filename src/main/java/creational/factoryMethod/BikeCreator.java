package main.java.creational.factoryMethod;

public class BikeCreator extends Creator {
    @Override
    public Transport createTransport() {
        return new Bike();
    }
}