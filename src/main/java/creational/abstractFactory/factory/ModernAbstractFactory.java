package main.java.creational.abstractFactory.factory;

import main.java.creational.abstractFactory.product.Chair;
import main.java.creational.abstractFactory.product.ModernChair;
import main.java.creational.abstractFactory.product.ModernTable;
import main.java.creational.abstractFactory.product.Table;

public class ModernAbstractFactory implements FurnitureAbstractFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}
