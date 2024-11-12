package org.example.task9;

public class Main {
    public static void main(String[] args) {
        // Получаем экземпляр настроек и изменяем их
        AppSettings settings = AppSettings.getInstance();
        settings.setLanguage("Русский");
        settings.setDarkMode(true);
        settings.setFontSize(16);

        // Выводим настройки
        System.out.println(settings);

        // В другой части приложения получаем настройки
        AppSettings otherSettings = AppSettings.getInstance();
        System.out.println("Темная тема включена: " + otherSettings.isDarkMode());
        System.out.println("Текущий язык: " + otherSettings.getLanguage());
    }
}
