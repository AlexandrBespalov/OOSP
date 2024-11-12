package org.example.task4;

public class MongoDB implements TargetDatabase {
    private String data;

    @Override
    public void insertData(String data) {
        System.out.println("Вставка данных в MongoDB: " + data);
        this.data = data;
    }

    @Override
    public String fetchData() {
        System.out.println("Извлечение данных из MongoDB...");
        return data;
    }
}
