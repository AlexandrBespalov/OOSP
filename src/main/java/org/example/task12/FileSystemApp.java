package org.example.task12;

public class FileSystemApp {
    public static void main(String[] args) {
        // Создаем файлы
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        File file3 = new File("file3.txt");

        // Создаем папки
        Directory dir1 = new Directory("Documents");
        Directory dir2 = new Directory("Images");

        // Добавляем файлы в папки
        dir1.add(file1);
        dir1.add(file2);

        dir2.add(file3);

        // Создаем главную папку и добавляем в нее другие папки
        Directory mainDir = new Directory("Root");
        mainDir.add(dir1);
        mainDir.add(dir2);

        // Выводим структуру файлов и папок
        mainDir.showDetails();
    }
}
