package org.example.task6;

public class OnlineOrder extends OrderProcessTemplate {
    @Override
    protected void confirmOrder() {
        System.out.println("Подтверждение онлайн-заказа.");
    }

    @Override
    protected void packOrder() {
        System.out.println("Упаковка онлайн-заказа.");
    }

    @Override
    protected void deliverOrder() {
        System.out.println("Доставка онлайн-заказа.");
    }
}
