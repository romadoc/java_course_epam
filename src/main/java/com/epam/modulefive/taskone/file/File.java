package com.epam.modulefive.taskone.file;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class File {

    private String fileContent;
    private String nameOfFile;
    private String pathToFileDir;

    public File(String nameOfFile, String pathToFileDir) {
        this.nameOfFile = nameOfFile;
        this.pathToFileDir = pathToFileDir;
    }

    public void makeFile() throws IOException {
        System.out.println("creating file");
        if (Files.exists(Paths.get(pathToFileDir + "\\" + nameOfFile))) {
            System.out.println("The file " + "\"" + nameOfFile + "\"" + " is already exists!");
        } else {
                Path newCreatedFile = Files.createFile(Paths.get(pathToFileDir + "\\" + nameOfFile));
                if (Files.exists(Paths.get(pathToFileDir + "\\" + nameOfFile))) {
                    System.out.println("The file " + "\"" + nameOfFile + "\"" + " is successfully created!");
            }
        }
    }

    public void deleteFile() throws IOException {
        System.out.println("deleting file operation");
        if (Files.exists(Paths.get(pathToFileDir + "\\" + nameOfFile))) {
            Files.delete(Paths.get(pathToFileDir + "\\" + nameOfFile));
            System.out.println("The file " + "\"" + nameOfFile + "\"" + " is successfully deleted");
        } else {
            System.out.println("no such " + "\"" + nameOfFile + "\"" + " file");
        }
    }

    public void renameFile(String newFileName) throws IOException {
        System.out.println("renaming file operation");
        if (Files.exists(Paths.get(pathToFileDir + "\\" + nameOfFile))) {
            Files.move(Paths.get(pathToFileDir + "\\" + nameOfFile),
                                 Paths.get(pathToFileDir + "\\" + newFileName));
            System.out.println("The file " + "\"" + nameOfFile + "\""
                                           + " is successfully renamed to "
                                           + "\"" + newFileName + "\"");
            nameOfFile = newFileName;
        } else {
            System.out.println("no such " + "\"" + nameOfFile + "\"" + " file!");
        }
    }

    public void setFileContent(String fileContent) throws IOException {
        System.out.println("setting file content");
            this.fileContent = fileContent;
            Files.write(Paths.get(pathToFileDir + "\\" + nameOfFile), fileContent.getBytes(),
                                  StandardOpenOption.WRITE);


    }

    public void addFileContent(String addedString) {
        System.out.println("adding file content");
        try {
            String string = null;
            Files.write(Paths.get(pathToFileDir + "\\" + nameOfFile), addedString.getBytes(),
                                  StandardOpenOption.APPEND);
        }
        catch (IOException e) {
            System.out.println(e);
        }

    }

    public void printFileToConsole() {
        System.out.println("printing file to console operation");
        Path pathFile = Paths.get(pathToFileDir + "\\" + nameOfFile);
        java.io.File file = new java.io.File(String.valueOf(pathFile));
        try {
            String string = "";
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                string = scanner.nextLine();
                System.out.println(string + "\n");
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void setNameOfFile(String nameOfFile) {
        this.nameOfFile = nameOfFile;
    }

    public void setPathToFileDir(String pathToFileDir) {
        this.pathToFileDir = pathToFileDir;
    }

    public String getFileContent() {
        return fileContent;
    }

    @Override
    public String toString() {
        return "File contents: \n" + fileContent ;
    }
}
