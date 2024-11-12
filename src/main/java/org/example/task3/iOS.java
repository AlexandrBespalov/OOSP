package org.example.task3;

public class iOS implements OperatingSystem {
    @Override
    public void boot() {
        System.out.println("Запуск iOS...");
    }

    @Override
    public void shutdown() {
        System.out.println("Выключение iOS...");
    }
}
