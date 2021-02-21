package com.epam.modulethree.stringandstringbuilder;

/**
 * Из заданной строки получить новую, повторив каждый символ дважды.
 * task 6 https://learn.epam.com/myLearning/program?groupGuid=df7fb55b-0efc-452b-9509-aa8160990adb
 */
public class Main6 {
    public static void main(String[] args) {
        String s = "Из заданной строки получить новую, повторив каждый символ дважды.";
        String result = "";
        solveTask(s, result);
    }
    private static void solveTask(String s, String dist) {
        char[] chars = s.toCharArray();
        StringBuilder distBuilder = new StringBuilder(dist);
        for (int i = 0; i < chars.length; i++) {
            distBuilder.append(chars[i]).append(chars[i]);
        }
        dist = distBuilder.toString();
        System.out.println(s);
        System.out.println(dist);
    }
}
