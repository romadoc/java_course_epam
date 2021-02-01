package com.epam.modulefive.taskone.directory;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Directory {

    private String nameDirectory;
    private String pathToDirectory;

    public void makeDirectory() throws IOException {
        System.out.println("creating new directory");
        if (Files.exists(Paths.get(pathToDirectory + nameDirectory))) {
            System.out.println("The directory " + "\"" + nameDirectory + "\"" + " is already exists!");
        } else {
            Path newDirectory = Files.createDirectory(Paths.get(pathToDirectory + nameDirectory));
            if (Files.exists(Paths.get(pathToDirectory + nameDirectory))) {
            System.out.println("The directory " + "\"" + newDirectory + "\"" + " is successfully created!");
        }
      }
    }

    public void deleteDirectory() throws IOException {
        System.out.println("deleting directory operation");
        if (Files.exists(Paths.get(pathToDirectory + nameDirectory))) {
            Files.delete(Paths.get(pathToDirectory + nameDirectory));
            System.out.println("The directory " + "\"" + nameDirectory + "\"" + " is successfully deleted");
        } else {
            System.out.println("no such " + "\"" + nameDirectory + "\"" + " directory!");
        }
    }

    public void renameDirectory(String newNameDirectory) throws IOException {
        System.out.println("renaming directory operation");
        if (Files.exists(Paths.get(pathToDirectory + nameDirectory))) {
            Files.move(Paths.get(pathToDirectory + nameDirectory), Paths.get(pathToDirectory
                                + newNameDirectory));
            System.out.println("The directory " + "\"" + nameDirectory + "\""
                                                + " is successfully renamed to "
                                                + "\"" + newNameDirectory + "\"");
        } else {
            System.out.println("no such " + "\"" + nameDirectory + "\"" + " directory!");
        }
    }

    public void outputToConsoleContentOfDirectory() {
        System.out.println("printing contents of directory");
        System.out.println("the content of the directory:");
        File shownDirectory = new File(pathToDirectory + nameDirectory);
        if (shownDirectory.isDirectory()) {
            for (File file : shownDirectory.listFiles()) {
                if(file.isFile()) {
                    System.out.println(file.getName() + " - file");
                } else {
                    System.out.println(file.getName() + " - directory");
                }
            }
        }
        System.out.println();
    }

    public String getNameDirectory() {
        return nameDirectory;
    }

    public void setNameDirectory(String nameDirectory) {
        this.nameDirectory = nameDirectory;
    }

    public String getPathToDirectory() {
        return pathToDirectory;
    }

    public void setPathToDirectory(String pathToDirectory) {
        this.pathToDirectory = pathToDirectory;
    }
}
