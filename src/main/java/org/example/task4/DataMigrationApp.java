package org.example.task4;

public class DataMigrationApp {
    public static void main(String[] args) {
        // Исходная база данных MySQL
        MySQL mySQLDatabase = new MySQL();
        mySQLDatabase.addData("Данные для переноса");

        // Адаптер для MySQL, чтобы он соответствовал интерфейсу целевой базы данных
        TargetDatabase mySQLAdapter = new MySQLAdapter(mySQLDatabase);

        // Целевая база данных MongoDB
        TargetDatabase mongoDB = new MongoDB();

        // Извлекаем данные из MySQL через адаптер и вставляем их в MongoDB
        String data = mySQLAdapter.fetchData();
        mongoDB.insertData(data);

        // Проверка данных в MongoDB
        System.out.println("Данные в MongoDB: " + mongoDB.fetchData());
    }
}
