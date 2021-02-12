package textanalyzer.textfortest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextFileReader {

    public static String TextFileReader() throws FileNotFoundException {
        String separator = File.separator;
        StringBuilder stringBuilder = new StringBuilder();
        String path = separator+"E:"+separator+"java_course"+separator+"src"+separator
                +"main"+separator+"java"+separator+ "textanalyzer" +separator+"textfortest"+separator+"testedText.txt";
        File fileToRead = new File(path);
        Scanner scanner = new Scanner(fileToRead);
        while (scanner.hasNextLine()){

            stringBuilder.append(scanner.nextLine());
        }
        String textFromFile;
        textFromFile = stringBuilder.toString();
        return textFromFile;
    }
}
