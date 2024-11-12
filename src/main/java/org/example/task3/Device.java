package org.example.task3;

public abstract class Device {
    protected OperatingSystem os;

    public Device(OperatingSystem os) {
        this.os = os;
    }

    public abstract void turnOn();
    public abstract void turnOff();
}
