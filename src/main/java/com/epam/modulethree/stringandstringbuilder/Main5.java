package com.epam.modulethree.stringandstringbuilder;

/**
 * Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
 * task 5 https://learn.epam.com/myLearning/program?groupGuid=df7fb55b-0efc-452b-9509-aa8160990adb
 */
public class Main5 {
    public static void main(String[] args) {
        String s = "public static void main";
        solveTask(s);
    }
    private static void solveTask(String s) {
        char[] chars = s.toCharArray();
        char pattern = 'a';
        int counter = 0;
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == pattern){
                counter++;
            }
        }
        System.out.println("\'a\' in string " + "\"" + s + "\"" + " is met: " + counter);
    }
}
