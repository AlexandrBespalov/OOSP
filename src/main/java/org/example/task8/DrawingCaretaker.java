package org.example.task8;

import java.util.ArrayList;
import java.util.List;

public class DrawingCaretaker {
    private List<DrawingMemento> savedStates = new ArrayList<>();

    public void saveState(Drawing drawing) {
        savedStates.add(drawing.save());
        System.out.println("Состояние сохранено.");
    }

    public void restoreState(Drawing drawing, int index) {
        if (index < 0 || index >= savedStates.size()) {
            System.out.println("Недопустимый индекс состояния.");
            return;
        }
        drawing.restore(savedStates.get(index));
    }

    public int getSavedStatesCount() {
        return savedStates.size();
    }
}
