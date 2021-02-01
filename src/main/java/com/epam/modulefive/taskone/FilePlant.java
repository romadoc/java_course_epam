package com.epam.modulefive.taskone;

import com.epam.modulefive.taskone.directory.Directory;
import com.epam.modulefive.taskone.file.TextFile;
import com.epam.utils.ScannerUtil;
import java.io.IOException;

public class FilePlant {

    private final static String NAME_DIR = "type name of directory\nfor example: \"ExampleDir\"";
    private final static String PATH_STR = "type path of directory\nfor example: \"C:\\\"";

    String nameDirectory;
    String pathToDirectory;
    String pathToFileDirectory;
    String nameOfFile;

    public Directory setDirectory() throws IOException {
        Directory directory = new Directory();
        nameDirectory = ScannerUtil.stringIn(NAME_DIR);
        pathToDirectory = ScannerUtil.stringIn(PATH_STR);
        directory.setNameDirectory(nameDirectory);
        directory.setPathToDirectory(pathToDirectory);
        directory.makeDirectory();
        return directory;
    }

    public TextFile setTextFile() throws IOException {
        pathToFileDirectory = pathToDirectory + "\\" + nameDirectory;
        nameOfFile = ScannerUtil.stringIn("type the name of file with txt ext.");
        TextFile textFile = new TextFile(nameOfFile, pathToFileDirectory);
        textFile.setPathToFileDir(pathToFileDirectory);
        textFile.setNameOfFile(nameOfFile);
        textFile.makeFile();
        return textFile;
    }
}
