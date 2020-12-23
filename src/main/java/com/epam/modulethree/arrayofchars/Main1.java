package com.epam.modulethree.arrayofchars;

/**
 * Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
 * task 1 https://learn.epam.com/myLearning/program?groupGuid=df7fb55b-0efc-452b-9509-aa8160990adb
 */

public class Main1 {
    public static void main(String[] args) {
        String[]array = {"introOne", "introTwo", "camelStyle", "myBike"};
        printData("starting strings", array);
        String[]convertedArray = makeFinishedArray(array);
        printData("converted strings", convertedArray);

    }

    private static void printData(String s, String[]arrayIn){
        System.out.print(s + ": ");
        for (String elem: arrayIn) {
            System.out.print(elem + "; ");
        }
        System.out.println();
    }

    private static int seachCharsInUpperCasePosition(String s){
        char[]ch = s.toCharArray();
        int postion = 0;
        for (int i = 0; i < ch.length; i++){
            if (Character.isUpperCase(ch[i])){
                postion = i;
            }
        }
        return postion;
    }

    private static String changeChars(String s){

        int position = seachCharsInUpperCasePosition(s);
        char[]chars = s.toCharArray();
        char[]chars1 = new char[s.length()+1];
        for (int i = 0; i < position; i++){
            chars1[i] = chars[i];
        }

        chars1[position] = '_';

        for (int i = position+1; i< chars1.length; i++){
            chars1[i] = chars[i-1];
        }

        s = "";

        for (int i = 0; i<chars1.length; i++){
            s = s + chars1[i];

        }

        s = s.toLowerCase();

        return s;
    }

    private static String[] makeFinishedArray(String[]strings){
        String[]convertedArray = new String[strings.length];
        for (int i = 0; i < convertedArray.length; i++){
            convertedArray[i] = changeChars(strings[i]);
        }
        return convertedArray;
    }
}
