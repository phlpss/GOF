package main.java.creational.abstractFactory.factory;

import main.java.creational.abstractFactory.product.Chair;
import main.java.creational.abstractFactory.product.LoftChair;
import main.java.creational.abstractFactory.product.LoftTable;
import main.java.creational.abstractFactory.product.Table;

public class LoftFurnitureFactory implements FurnitureAbstractFactory {
    @Override
    public Chair createChair() {
        return new LoftChair();
    }

    @Override
    public Table createTable() {
        return new LoftTable();
    }
}
