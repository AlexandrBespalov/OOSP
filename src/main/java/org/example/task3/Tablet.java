package org.example.task3;

public class Tablet extends Device {
    public Tablet(OperatingSystem os) {
        super(os);
    }

    @Override
    public void turnOn() {
        System.out.print("Планшет включается: ");
        os.boot();
    }

    @Override
    public void turnOff() {
        System.out.print("Планшет выключается: ");
        os.shutdown();
    }
}
