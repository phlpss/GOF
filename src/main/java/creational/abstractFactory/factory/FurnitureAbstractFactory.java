package main.java.creational.abstractFactory.factory;

import main.java.creational.abstractFactory.product.Chair;
import main.java.creational.abstractFactory.product.Table;

public interface FurnitureAbstractFactory {
    public Chair createChair();
    public Table createTable();
}