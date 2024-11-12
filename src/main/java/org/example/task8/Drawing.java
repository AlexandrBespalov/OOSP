package org.example.task8;

import java.util.ArrayList;
import java.util.List;

public class Drawing {
    private List<String> elements = new ArrayList<>();

    public void addElement(String element) {
        elements.add(element);
        System.out.println("Элемент добавлен: " + element);
    }

    public DrawingMemento save() {
        return new DrawingMemento(new ArrayList<>(elements));
    }

    public void restore(DrawingMemento memento) {
        elements = memento.getElements();
        System.out.println("Рисунок восстановлен до состояния: " + elements);
    }

    @Override
    public String toString() {
        return "Текущее состояние рисунка: " + elements;
    }
}
