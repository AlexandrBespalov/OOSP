package org.example.task11;

public class TaskManager {
    public static void main(String[] args) {
        // Создание исходных задач
        Task devTask = new DevelopmentTask("Разработка новой фичи", "Добавить функцию фильтрации", "Высокий");
        Task testTask = new TestingTask("Тестирование новой фичи", "Провести тестирование фильтрации", "Средний");

        System.out.println("Исходные задачи:");
        System.out.println(devTask);
        System.out.println(testTask);

        // Клонирование задач
        Task clonedDevTask = devTask.clone();
        Task clonedTestTask = testTask.clone();

        // Изменяем параметры клонированных задач
        clonedDevTask.setTitle("Разработка новой фичи (клонированная)");
        clonedTestTask.setPriority("Низкий");

        // Выводим клонированные задачи
        System.out.println("\nКлонированные задачи:");
        System.out.println(clonedDevTask);
        System.out.println(clonedTestTask);
    }
}
