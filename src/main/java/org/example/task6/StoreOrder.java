package org.example.task6;

public class StoreOrder extends OrderProcessTemplate {
    @Override
    protected void confirmOrder() {
        System.out.println("Подтверждение заказа в магазине.");
    }

    @Override
    protected void packOrder() {
        System.out.println("Упаковка заказа в магазине.");
    }

    @Override
    protected void deliverOrder() {
        System.out.println("Самовывоз заказа из магазина.");
    }
}
