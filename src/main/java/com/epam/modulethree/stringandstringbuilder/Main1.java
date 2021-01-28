package com.epam.modulethree.stringandstringbuilder;

import com.epam.utils.ScannerUtil;

/**
 * Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
 * Task1 https://learn.epam.com/myLearning/program?groupGuid=df7fb55b-0efc-452b-9509-aa8160990adb
 */

public class Main1 {
    public static void main(String[] args) {
        String s = ScannerUtil.stringIn("Type string");
        solveTask(s);
    }

    private static void solveTask(String s) {
        char[]chars = s.toCharArray();
        int max;
        max = 0;
        int pointer;
        pointer = 0;
        char pattern = ' ';
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == pattern) {
                pointer++;
                if (pointer > max) {
                    max = pointer;
                }
            }
            else pointer = 0;
        }


        System.out.println("maximum: " + max);

    }
}
