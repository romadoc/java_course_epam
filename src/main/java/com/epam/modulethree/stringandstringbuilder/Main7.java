package com.epam.modulethree.stringandstringbuilder;

import com.epam.utils.ScannerUtil;

/**
 * Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde
 * def", то должно быть выведено "abcdef".
 * task 7 https://learn.epam.com/myLearning/program?groupGuid=df7fb55b-0efc-452b-9509-aa8160990adb
 */

public class Main7 {
    public static void main(String[] args) {
        String s = ScannerUtil.stringIn("Type string with repeated chars");
        String stringResult = solveTask(removeSpaces(s));
        System.out.print("result string: " + stringResult);
    }

    private static String removeSpaces(String s) {
        String s1;
        char[] chars = s.toCharArray();
        char space = ' ';
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != space) {
                sb.append(chars[i]);
            }
        }
        s1 = sb.toString();
        return s1;
    }

    private static String solveTask(String s) {
        char[] chars = s.toCharArray();
        String s1 = "";

        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            StringBuilder sb1 = new StringBuilder();
            sb1.append(ch);
            if (!s1.contains(sb1)) {
                s1 = s1 + ch;
            }
        }
        return s1;
    }
}
