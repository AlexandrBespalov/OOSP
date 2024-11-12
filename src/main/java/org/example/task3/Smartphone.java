package org.example.task3;

public class Smartphone extends Device {
    public Smartphone(OperatingSystem os) {
        super(os);
    }

    @Override
    public void turnOn() {
        System.out.print("Смартфон включается: ");
        os.boot();
    }

    @Override
    public void turnOff() {
        System.out.print("Смартфон выключается: ");
        os.shutdown();
    }
}
