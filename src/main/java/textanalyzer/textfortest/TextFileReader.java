package textanalyzer.textfortest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextFileReader {

    public static String TextFileReader() throws FileNotFoundException {
        String separator = File.separator;
        String textFromFile;
        StringBuilder stringBuilder = new StringBuilder();
        String path = separator+"E:"+separator+"java_course"+separator+"src"+separator
                +"main"+separator+"java"+separator+ "textanalyzer" +separator+"textfortest"+separator+"testedText.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()){

            stringBuilder.append(scanner.nextLine());
        }
        textFromFile = stringBuilder.toString();
        return textFromFile;
    }
}
