package module3.part3_pattern_matcher;
/*
Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных
операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине;
отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по
алфавиту.
 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main1 {
    public static void main(String[] args) {
        String textString = stringConstructor();
        System.out.println(textString);
        String[] textAsParagraphs = paragraphSplitter(textString);
        paragraphsSorter(textAsParagraphs);
        wordsOfSentenceSorter(textString);
        arrayOfSentences(textString);
        char chForTask;
        chForTask = charInput();
        System.out.println("********************************************************");
        for(int i = 0; i < arrayOfSentences(textString).length; i++){
            arrayOfSentenceWordsSorter(arrayOfSentences(textString)[i], chForTask);
        }

    }

    private static String stringConstructor() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("  Why is Java so popular?\n").
                append("\u2029  One of the biggest reasons why Java is so popular is the platform iindependence.\n" +
                        "Programs can run on several different types of computer; as long as the computer has " +
                        "a Java Runtime Environment (JRE) installed, a Java program can run on it. So that's why I like java. \n").
                append("\u2029  Most types of computers will be compatible with a JRE including PCs running on Windows, " +
                        "Macintosh computers, Unix or Linux computers, and large mainframe computers, " +
                        "as well as mobile phones. \n" +
                        "Since it has been around for so long, some of the biggest organisations in the world are " +
                        "built using the language. \n" +
                        "\u2029  Many banks, retailers, insurance companies, utilities, and manufacturers all use Java.");
        String s1 = stringBuilder.toString();

        return s1;
    }

    private static String[] paragraphSplitter(String text) {

        String[] s1 = text.split("\u2029");
        return s1;

    }

    private static void paragraphsSorter(String[] strings) {
        System.out.println("********************************************************");
        System.out.println("SORTED PARAGRAPHS: ");

        for (int i = 0; i < strings.length - 1; i++) {

            if (sentenceCounter(strings[i]) < sentenceCounter(strings[i + 1])) {
                String tempStr = strings[i];
                strings[i] = strings[i + 1];
                strings[i + 1] = tempStr;
            }
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }

    private static int sentenceCounter(String stringIn) {
        int count = 0;
        String pattern = "([.!?])([A-Z]*)";
        Pattern pattern1 = Pattern.compile(pattern);
        Matcher m = pattern1.matcher(stringIn);
        while (m.find()) {
            count++;
        }
        return count;
    }

    private static void wordsOfSentenceSorter(String stringIn) {

        System.out.println("********************************************************");
        System.out.println("SORTED WORDS ACCORDING TO THE LENGTH: ");
        Pattern patternSentence = Pattern.compile("([.!?])([A-Z]*)");
        String[] stringsOfSentence = patternSentence.split(stringIn);
        Pattern patternWord = Pattern.compile("\\s*(\\s|,|!|\\.)\\s*");

        for (int i = 0; i < stringsOfSentence.length; i++) {

            String[] stringsOfWords = patternWord.split(stringsOfSentence[i]);

            for (int j = 0; j < stringsOfWords.length; j++) {
                for (int y = 0; y < stringsOfWords.length - 1 - j; y++) {
                    if (stringsOfWords[y].length() > stringsOfWords[y + 1].length()) {
                        String str = stringsOfWords[y];
                        stringsOfWords[y] = stringsOfWords[y + 1];
                        stringsOfWords[y + 1] = str;
                    }
                }
            }
            for (String s : stringsOfWords) {
                System.out.print(s + " ");
            }
            System.out.println(".");
        }
    }

    private static char charInput() {
        System.out.println("********************************************************");
        System.out.print("Type a char:>>");
        Scanner scanner = new Scanner(System.in);
        String tIn = scanner.next();
        char a = tIn.charAt(tIn.length() - 1);
        return a;
    }

    private static String[] arrayOfSentences(String stringIn) {
        Pattern patternSentence = Pattern.compile("([.!?])([A-Z]*)");
        String[] stringsOfSentence = patternSentence.split(stringIn);
        return stringsOfSentence;
    }
    private static void arrayOfSentenceWordsSorter(String sentence, char ch){

        String[]wordsInSentence = sentence.split(" ");

            for (int i = 0; i < wordsInSentence.length; i++) {
                for (int y = 0; y < wordsInSentence.length-1; y++) {
                    if (charsInWordCounter(wordsInSentence[y], ch) < charsInWordCounter(wordsInSentence[y + 1], ch)) {
                        String temp = wordsInSentence[y];
                        wordsInSentence[y] = wordsInSentence[y + 1];
                        wordsInSentence[y + 1] = temp;
                    }
                }
            }

            for (int i =0; i <wordsInSentence.length; i++){
                for(int y = 0; y < wordsInSentence.length-1; y++){
                    if(charsInWordCounter(wordsInSentence[y], ch) == charsInWordCounter(wordsInSentence[y+1],ch)){
                        Arrays.sort(wordsInSentence);
                    }
                }
            }
            for (String s: wordsInSentence){
                System.out.print(s + " ");
            }

    }
    private static int charsInWordCounter(String word, char ch){
        String pattern = "";
        pattern = pattern + ch;
        int countCharInWord = 0;
        String[]strings = word.split(pattern);
        countCharInWord = strings.length - 1;
        return countCharInWord;
    }
}
