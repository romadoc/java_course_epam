package com.epam.modulethree.stringandstringbuilder;

/**
 *  С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
 *  task 4 https://learn.epam.com/myLearning/program?groupGuid=df7fb55b-0efc-452b-9509-aa8160990adb
 */
public class Main4 {
    public static void main(String[] args) {
        String start = "информатика";
        String result = "";
        result = solveTask(start, result);
        System.out.println(result);
    }
    private static String solveTask(String s, String dist){

        char[]chars = new char[4];
        s.getChars(7,8,chars,0);
        s.getChars(3,5, chars, 1);
        s.getChars(7,8,chars,3);
        for (int i = 0; i < chars.length; i++){
            dist = dist + chars[i];
        }
        return dist;
    }
}
