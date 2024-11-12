package org.example.task3;

public class DeviceManager {
    public static void main(String[] args) {
        OperatingSystem ios = new iOS();
        OperatingSystem android = new Android();
        OperatingSystem windows = new Windows();

        Device smartphone = new Smartphone(android);
        Device tablet = new Tablet(ios);
        Device laptop = new Laptop(windows);

        System.out.println("Управление смартфоном:");
        smartphone.turnOn();
        smartphone.turnOff();

        System.out.println("\nУправление планшетом:");
        tablet.turnOn();
        tablet.turnOff();

        System.out.println("\nУправление ноутбуком:");
        laptop.turnOn();
        laptop.turnOff();
    }
}
