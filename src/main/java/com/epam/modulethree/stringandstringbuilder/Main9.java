package com.epam.modulethree.stringandstringbuilder;

import com.epam.utils.ScannerUtil;

/**
 * Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские
 * буквы.
 * task 9 https://learn.epam.com/myLearning/program?groupGuid=df7fb55b-0efc-452b-9509-aa8160990adb
 */
public class Main9 {
    public static void main(String[] args) {
        String s = ScannerUtil.stringIn("Type string");
        String latinCharacters = findlatinChar(s);
        solveTask(latinCharacters);

    }

    private static String findlatinChar(String s){
        char[]chars = s.toCharArray();
        String s1="";
        for(int i = 0; i < chars.length; i++) {
            if (chars[i] < 123){
                s1 = s1 + chars[i];
            }
        }
        return s1;
    }

    private static void solveTask(String s){
        int lowerCase = 0;
        int upperCase = 0;
        char[]chars = s.toCharArray();
        for(int i = 0; i < chars.length; i++){
            if(Character.isUpperCase(chars[i])){
                upperCase++;
            }
            if(Character.isLowerCase(chars[i])){
                lowerCase++;
            }
        }
        System.out.println();
        System.out.println("lower cases: " + lowerCase);
        System.out.println("upper cases: " + upperCase);
    }
}
