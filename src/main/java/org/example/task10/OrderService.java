package org.example.task10;

import java.util.ArrayList;
import java.util.List;

public class OrderService {
    private List<String> currentOrder;

    public OrderService() {
        currentOrder = new ArrayList<>();
    }

    public void addToOrder(String item) {
        currentOrder.add(item);
        System.out.println("Добавлено в заказ: " + item);
    }

    public List<String> getCurrentOrder() {
        return currentOrder;
    }
}
