package com.epam.modulefive.taskone;

import com.epam.modulefive.taskone.directory.Directory;
import com.epam.modulefive.taskone.file.TextFile;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        FilePlant filePlant = new FilePlant();
        Directory directory = filePlant.setDirectory();
        TextFile textFile = filePlant.setTextFile();
        textFile.setFileContent("first string ");
        textFile.printFileToConsole();
        textFile.addFileContent("added strings");
        textFile.printFileToConsole();

    }
}
