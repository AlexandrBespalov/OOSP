package org.example.task8;

public class DrawingApp {
    public static void main(String[] args) {
        Drawing drawing = new Drawing();
        DrawingCaretaker caretaker = new DrawingCaretaker();

        // Рисуем и сохраняем состояния
        drawing.addElement("Круг");
        caretaker.saveState(drawing);

        drawing.addElement("Квадрат");
        caretaker.saveState(drawing);

        drawing.addElement("Треугольник");
        System.out.println(drawing);

        // Восстанавливаем состояние
        caretaker.restoreState(drawing, 0);
        System.out.println(drawing);

        caretaker.restoreState(drawing, 1);
        System.out.println(drawing);
    }
}
