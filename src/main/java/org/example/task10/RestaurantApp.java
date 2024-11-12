package org.example.task10;

public class RestaurantApp {
    public static void main(String[] args) {
        RestaurantFacade restaurant = new RestaurantFacade();

        // Клиент просматривает меню
        restaurant.viewMenu();

        // Клиент делает заказ
        restaurant.addItemToOrder("Салат Цезарь");
        restaurant.addItemToOrder("Пицца Маргарита");

        // Клиент оплачивает счет
        restaurant.payBill(1200.00);
    }
}
