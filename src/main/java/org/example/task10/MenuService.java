package org.example.task10;

import java.util.ArrayList;
import java.util.List;

public class MenuService {
    private List<String> menuItems;

    public MenuService() {
        menuItems = new ArrayList<>();
        menuItems.add("Салат Цезарь");
        menuItems.add("Спагетти Карбонара");
        menuItems.add("Пицца Маргарита");
        menuItems.add("Суп Минестроне");
    }

    public List<String> getMenu() {
        System.out.println("Меню ресторана: " + menuItems);
        return menuItems;
    }
}
