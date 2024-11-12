package org.example.task1;

public class Main {
    public static void main(String[] args) {
        Transport car = TransportFactory.createTransport("car");
        Transport bicycle = TransportFactory.createTransport("bicycle");
        Transport motorcycle = TransportFactory.createTransport("motorcycle");

        car.drive();
        bicycle.drive();
        motorcycle.drive();
    }
}

