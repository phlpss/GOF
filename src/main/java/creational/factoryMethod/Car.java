package main.java.creational.factoryMethod;

public class Car implements Transport {
    @Override
    public String giveRide() {
        return "Car gives a ride";
    }
}