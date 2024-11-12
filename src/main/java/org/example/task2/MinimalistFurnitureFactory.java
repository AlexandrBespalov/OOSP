package org.example.task2;

public class MinimalistFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new MinimalistChair();
    }

    @Override
    public Table createTable() {
        return new MinimalistTable();
    }

    @Override
    public Cabinet createCabinet() {
        return new MinimalistCabinet();
    }
}
