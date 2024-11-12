package org.example.task3;

public class Android implements OperatingSystem {
    @Override
    public void boot() {
        System.out.println("Запуск Android...");
    }

    @Override
    public void shutdown() {
        System.out.println("Выключение Android...");
    }
}
