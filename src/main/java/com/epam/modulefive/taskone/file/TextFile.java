package com.epam.modulefive.taskone.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Создать объект класса Текстовый файл, используя классы Файл, Директория.
 * Методы:
 * создать,
 * переименовать,
 * вывести на консоль содержимое,
 * дополнить,
 * удалить.
 */

public class TextFile extends File {

    private String nameOfFile;
    private String pathToFileDir;


    public TextFile(String nameOfFile, String pathToFileDir) {
        super(nameOfFile, pathToFileDir);
    }

    @Override
    public void makeFile() throws IOException {

        if (!nameOfFile.contains(".txt")) {
            System.out.println("txt extentions only!");
        } else {
            Path newCreatedFile = Files.createFile(Paths.get(pathToFileDir + "\\" + nameOfFile));
            if (Files.exists(Paths.get(pathToFileDir + "\\" + nameOfFile))) {
                System.out.println("The file " + "\"" + nameOfFile + "\"" + " is successfully created!");
            }
        }
    }


    @Override
    public void setNameOfFile(String nameOfFile) {
        this.nameOfFile = nameOfFile;
    }

    @Override
    public void setPathToFileDir(String pathToFileDir) {
        this.pathToFileDir = pathToFileDir;
    }
}
