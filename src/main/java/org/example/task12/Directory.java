package org.example.task12;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileComponent {
    private String name;
    private List<FileComponent> components = new ArrayList<>(); // Содержит файлы и другие папки

    public Directory(String name) {
        this.name = name;
    }

    // Метод для добавления файла или папки в директорию
    public void add(FileComponent component) {
        components.add(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Папка: " + name);
        for (FileComponent component : components) {
            component.showDetails(); // Рекурсивный вызов для показа содержимого
        }
    }
}
