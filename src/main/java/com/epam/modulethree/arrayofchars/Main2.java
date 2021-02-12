package com.epam.modulethree.arrayofchars;

import java.util.Arrays;

/**
 * Замените в строке все вхождения 'word' на 'letter'.
 * task2 : https://learn.epam.com/myLearning/program?groupGuid=df7fb55b-0efc-452b-9509-aa8160990adb
 */
public class Main2 {
    public static void main(String[] args) {
        String s = "i'am writting a word and my sister reads word";
        String findPattern = "word";
        String shiftPattern = "letter";
        char[]startArray = makeStartArray(s);
        printData(startArray,"start line");
        char[][]charForAnalisys = makeCharArraysForAnalysis(s);
        char[][]printChar = findAndShiftChars(charForAnalisys,findPattern,shiftPattern);
        printRezult(printChar, "result");
    }

    private static char[] makeStartArray(String s){
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

    private static char[][] makeCharArraysForAnalysis(String start){

        String[]arrayStrings = start.split(" ");
        char[][]arraysChars = new char[arrayStrings.length][1];
        for(int i = 0; i <arrayStrings.length; i++){
            for (int j = 0; j < arraysChars[i].length; j++){
                arraysChars[i] = arrayStrings[i].toCharArray();
            }

        }
        return arraysChars;
    }

    private static char[][] findAndShiftChars(char[][]arrayIn, String foundStr, String pattern){
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
