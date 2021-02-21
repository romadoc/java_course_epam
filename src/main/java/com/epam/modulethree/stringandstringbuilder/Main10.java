package com.epam.modulethree.stringandstringbuilder;

import com.epam.utils.ScannerUtil;

/**
 * Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
 * знаком. Определить количество предложений в строке X.
 * Task 10 https://learn.epam.com/myLearning/program?groupGuid=df7fb55b-0efc-452b-9509-aa8160990adb
 */

public class Main10 {
    public static void main(String[] args) {
        String s = ScannerUtil.stringIn("Type string");
        solveTask(s);
    }

    private static void solveTask(String s){
        char[] chars = s.toCharArray();
        int count = 0;
        for(int i = 1; i < chars.length; i++ ){
            if ((chars[i] == '.' || chars[i] == '!' || chars[i] == '?') && (chars[i-1] != ' ')){
                count++;
            }
        }
        System.out.println(count);
    }
}
