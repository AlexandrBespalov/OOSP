package org.example.task3;

public class Windows implements OperatingSystem {
    @Override
    public void boot() {
        System.out.println("Запуск Windows...");
    }

    @Override
    public void shutdown() {
        System.out.println("Выключение Windows...");
    }
}
