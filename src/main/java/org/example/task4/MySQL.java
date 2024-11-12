package org.example.task4;

public class MySQL {
    private String data;

    public void addData(String data) {
        System.out.println("Добавление данных в MySQL: " + data);
        this.data = data;
    }

    public String retrieveData() {
        System.out.println("Извлечение данных из MySQL...");
        return data;
    }
}
