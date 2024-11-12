package org.example.task4;

public class MySQLAdapter implements TargetDatabase {
    private MySQL mySQL;

    public MySQLAdapter(MySQL mySQL) {
        this.mySQL = mySQL;
    }

    @Override
    public void insertData(String data) {
        System.out.println("Адаптер преобразует данные для MySQL...");
        mySQL.addData(data);
    }

    @Override
    public String fetchData() {
        System.out.println("Адаптер преобразует данные из MySQL...");
        return mySQL.retrieveData();
    }
}
