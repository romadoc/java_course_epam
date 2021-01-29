package textanalyzer.wordprocessor;

import textanalyzer.textfortest.TextFileReader;
import java.io.IOException;

public class StartAnalyser {
    public static void main(String[] args) throws IOException {
        TextSplitter wordSplitter = new TextSplitter();
        String text = TextFileReader.TextFileReader();
        wordSplitter.createArrayOfWordsFromText(text);
        WordCounter.makeListOfOriginals(wordSplitter.createArrayOfWordsFromText(text));
    }
}
