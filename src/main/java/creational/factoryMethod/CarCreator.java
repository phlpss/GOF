package main.java.creational.factoryMethod;

public class CarCreator extends Creator {

    @Override
    public Transport createTransport() {
        return new Car();
    }
}