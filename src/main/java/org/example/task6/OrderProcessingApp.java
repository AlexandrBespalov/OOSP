package org.example.task6;

public class OrderProcessingApp {
    public static void main(String[] args) {
        System.out.println("Обработка онлайн-заказа:");
        OrderProcessTemplate onlineOrder = new OnlineOrder();
        onlineOrder.processOrder();

        System.out.println("\nОбработка заказа в магазине:");
        OrderProcessTemplate storeOrder = new StoreOrder();
        storeOrder.processOrder();
    }
}

