package org.example.task7;

public class DocumentBuilderApp {
    public static void main(String[] args) {
        DocumentBuilder builder = new DocumentBuilder();

        Document document = builder
                .addTitle("Отчет по проекту")
                .addSubtitle("Обзор проекта")
                .addParagraph("Этот документ содержит информацию о ходе проекта.")
                .addSubtitle("Основные достижения")
                .addBulletPoint("Завершена первая фаза проекта.")
                .addBulletPoint("Выполнено тестирование начальных модулей.")
                .addSubtitle("План на следующий месяц")
                .addParagraph("Завершение всех оставшихся задач по проекту.")
                .build();

        System.out.println(document);
    }
}
