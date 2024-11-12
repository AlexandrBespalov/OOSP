package org.example.task2;

public class FurnitureStore {
    private FurnitureFactory factory;

    public FurnitureStore(FurnitureFactory factory) {
        this.factory = factory;
    }

    public void createFurniture() {
        Chair chair = factory.createChair();
        Table table = factory.createTable();
        Cabinet cabinet = factory.createCabinet();

        chair.create();
        table.create();
        cabinet.create();
    }

    public static void main(String[] args) {
        FurnitureStore classicStore = new FurnitureStore(new ClassicFurnitureFactory());
        System.out.println("Создаем классическую мебель:");
        classicStore.createFurniture();

        FurnitureStore modernStore = new FurnitureStore(new ModernFurnitureFactory());
        System.out.println("\nСоздаем современную мебель:");
        modernStore.createFurniture();

        FurnitureStore minimalistStore = new FurnitureStore(new MinimalistFurnitureFactory());
        System.out.println("\nСоздаем мебель в стиле минимализма:");
        minimalistStore.createFurniture();
    }
}
