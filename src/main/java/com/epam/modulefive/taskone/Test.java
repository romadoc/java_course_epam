package com.epam.modulefive.taskone;

import com.epam.modulefive.taskone.directory.Directory;
import com.epam.modulefive.taskone.file.TextFile;
import java.io.IOException;

/**
 * Создать объект класса Текстовый файл, используя классы Файл, Директория.
 * Методы:
 * создать+,
 * вывести на консоль содержимое+,
 * дополнить+,
 * переименовать+,
 * удалить+
 */

public class Test {
    public static void main(String[] args) throws IOException {
        FilePlant filePlant = new FilePlant();
        Directory directory = filePlant.setDirectory();
        TextFile textFile = filePlant.setTextFile();
        textFile.setFileContent("first string ");
        textFile.printFileToConsole();
        textFile.addFileContent("added strings");
        textFile.printFileToConsole();
        textFile.renameFile("renametest.txt");
        textFile.printFileToConsole();
        textFile.deleteFile();

    }
}
