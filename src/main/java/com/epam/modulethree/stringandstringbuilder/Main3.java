package com.epam.modulethree.stringandstringbuilder;

import com.epam.utils.ScannerUtil;

/**
 *  Проверить, является ли заданное слово палиндромом.
 *  task 3 https://learn.epam.com/myLearning/program?groupGuid=df7fb55b-0efc-452b-9509-aa8160990adb
 */
public class Main3 {
    public static void main(String[] args) {
        String s = ScannerUtil.stringIn("type a word");
        char[] directChars = makeArray(s);
        char[] reversedChars = makeArrayReversed(s);
        solveTask(directChars, reversedChars);
    }

    private static char[] makeArray(String s) {
        s = s.toLowerCase();
        s = s.trim();
        char[] chars = s.toCharArray();
        return chars;
    }
    private static char[] makeArrayReversed(String s) {
        s = s.toLowerCase();
        s = s.trim();
        char[] chars = s.toCharArray();
        int n = chars.length;
        char temp;
        for(int i = 0; i < n / 2; i++) {
            temp = chars[n - i - 1];
            chars [n - i - 1] = chars[i];
            chars [i] = temp;
        }
        return chars;
    }
    private static void solveTask(char[] dchars, char[] rchars) {
        int isPalindrom = 0;
        for(int i = 0; i < dchars.length; i++) {
            if(dchars[i] == rchars[i]){
                isPalindrom = 0;
                isPalindrom = isPalindrom + isPalindrom;

            } else if(!(dchars[i] == rchars[i])) {
                isPalindrom = 1;
                isPalindrom += isPalindrom;
            }
        }
        if (isPalindrom == 0) {
            System.out.println("it is palindrom");
        } else {
            System.out.println("it is non palibdrom");
        }
    }
}
