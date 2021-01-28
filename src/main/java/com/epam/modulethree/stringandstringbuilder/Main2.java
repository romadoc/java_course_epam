package com.epam.modulethree.stringandstringbuilder;

/**
 * В строке вставить после каждого символа 'a' символ 'b'.
 * task2 https://learn.epam.com/myLearning/program?groupGuid=df7fb55b-0efc-452b-9509-aa8160990adb
 */
public class Main2 {
    public static void main(String[] args) {
        String s = "an apertura arerturates an abstract obj";
        printString(s);
        solveTask(s);
    }
    private static void printString(String s){
        System.out.println(s);
    }
    private static void solveTask(String s) {
        char shifted = 'a';
        char pattern = 'b';
        StringBuffer sb = new StringBuffer(s);
        for (int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i) == shifted) {
                sb.insert(i+1, pattern);
            }
        }
        System.out.println(sb);
    }
}
