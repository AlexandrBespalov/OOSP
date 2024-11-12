package org.example.task3;

public class Laptop extends Device {
    public Laptop(OperatingSystem os) {
        super(os);
    }

    @Override
    public void turnOn() {
        System.out.print("Ноутбук включается: ");
        os.boot();
    }

    @Override
    public void turnOff() {
        System.out.print("Ноутбук выключается: ");
        os.shutdown();
    }
}
