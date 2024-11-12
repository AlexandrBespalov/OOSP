package org.example.task1;

public class TransportFactory {
    public static Transport createTransport(String type) {
        switch (type.toLowerCase()) {
            case "car":
                return (Transport) new Car();
            case "bicycle":
                return new Bicycle();
            case "motorcycle":
                return new Motorcycle();
            default:
                throw new IllegalArgumentException("Unknown transport type: " + type);
        }
    }
}

