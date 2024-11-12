package org.example.task10;

public class RestaurantFacade {
    private MenuService menuService;
    private OrderService orderService;
    private PaymentService paymentService;

    public RestaurantFacade() {
        this.menuService = new MenuService();
        this.orderService = new OrderService();
        this.paymentService = new PaymentService();
    }

    // Метод для просмотра меню
    public void viewMenu() {
        menuService.getMenu();
    }

    // Метод для добавления блюда в заказ
    public void addItemToOrder(String item) {
        orderService.addToOrder(item);
    }

    // Метод для оплаты счета
    public void payBill(double amount) {
        paymentService.processPayment(amount);
    }
}
