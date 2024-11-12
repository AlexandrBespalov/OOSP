package org.example.task9;

public class AppSettings {
    // Единственный экземпляр класса
    private static AppSettings instance;

    // Пример настроек
    private String language;
    private boolean darkMode;
    private int fontSize;

    // Закрытый конструктор, чтобы предотвратить создание экземпляров извне
    private AppSettings() {
        // Устанавливаем настройки по умолчанию
        this.language = "English";
        this.darkMode = false;
        this.fontSize = 14;
    }

    // Метод для получения единственного экземпляра класса
    public static AppSettings getInstance() {
        if (instance == null) {
            instance = new AppSettings();
        }
        return instance;
    }

    // Методы для работы с настройками
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public boolean isDarkMode() {
        return darkMode;
    }

    public void setDarkMode(boolean darkMode) {
        this.darkMode = darkMode;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    @Override
    public String toString() {
        return "Настройки приложения: { " +
                "Язык = " + language +
                ", Темная тема = " + darkMode +
                ", Размер шрифта = " + fontSize +
                " }";
    }
}
