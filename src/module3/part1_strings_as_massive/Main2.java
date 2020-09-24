package module3.part1_strings_as_massive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 Замените в строке все вхождения 'word' на 'letter'.
 */
public class Main2 {
    public static void main(String[] args) {
        String s = "i'am writting a word and my sister reads word";
        String findPattern = "word";
        String shiftPattern = "letter";
        char[]startArray = arrayStartConstructor(s);
        printData(startArray,"start line");
        char[][]charForAnalisys = charArrays(s);
        char[][]printChar = suherAndShifter(charForAnalisys,findPattern,shiftPattern);

       printRezult(printChar, "result");
    }
    private static char[] arrayStartConstructor(String s){
        char[]arrayStartChar = s.toCharArray();
        return arrayStartChar;
    }
    private static void printData(char[]charsIn, String s){
        System.out.println();
        System.out.print(s + ": ");
        String s1 = "";
        for (char elem: charsIn) {
            s1 = s1 + elem;

        }
        System.out.println(s1);
    }

    private static char[][] charArrays(String start){

        String[]arrayStrings = start.split(" ");
        char[][]arraysChars = new char[arrayStrings.length][1];
        for(int i = 0; i <arrayStrings.length; i++){
            for (int j = 0; j < arraysChars[i].length; j++){
                arraysChars[i] = arrayStrings[i].toCharArray();
            }

        }

        return arraysChars;
    }
    private static char[][] suherAndShifter(char[][]arrayIn, String foundStr, String pattern){
        char[]foundChars = foundStr.toCharArray();
        char[]patternChars = pattern.toCharArray();
        boolean isShifted = false;
        while (!isShifted) {
            isShifted = true;
            for (int i = 0; i < arrayIn.length; i++) {
                for (int j = 0; j <= arrayIn[i].length; j++) {
                    if (Arrays.equals(arrayIn[j], foundChars)) {
                        arrayIn[j] = patternChars;
                    }
                }
            }
        }
        return arrayIn;
    }
    private static void printRezult(char[][]chars, String s){
        System.out.println(s + ": ");
        for (int i = 0; i < chars.length; i++){
            for(int j = 0; j < chars[i].length; j++){
                System.out.print(chars[i][j]);
            }
            System.out.print(" ");
        }
    }
}
