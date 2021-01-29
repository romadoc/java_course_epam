package com.epam.modulethree.stringandstringbuilder;

import com.epam.utils.ScannerUtil;

/**
 * Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых
 * длинных слов может быть несколько, не обрабатывать.
 * task8 https://learn.epam.com/myLearning/program?groupGuid=df7fb55b-0efc-452b-9509-aa8160990adb
 */
public class Task8 {
    public static void main(String[] args) {
        String s = ScannerUtil.stringIn("Type string with spaces");
        System.out.println("the most long word is: " + findMaxLenghthWord(s));

    }

    private static String findMaxLenghthWord(String s) {
        String[] strings = s.split(" ");
        String maximum = strings[0];
        for (int i = 0; i < strings.length; i++) {

            if (maximum.length() < strings[i].length()) {
                maximum = strings[i];
            }
        }
        return maximum;
    }
}
