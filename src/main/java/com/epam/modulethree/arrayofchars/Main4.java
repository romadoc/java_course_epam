package com.epam.modulethree.arrayofchars;

/**
 * в строке найти количество чисел
 * task 4 https://learn.epam.com/myLearning/program?groupGuid=df7fb55b-0efc-452b-9509-aa8160990adb
 */
public class Main4 {
    public static void main(String[] args) {
        String s = "in this 22 string 5 there 88 are 4 digits 33";
        String[]creator = createArray(s);
        System.out.println("string for counting: " + s);
        findDigit(creator);
    }

    private static String[] createArray(String s) {
        String[]array = s.split(" ");
        return array;
    }

    private static void findDigit(String[]arrayIn) {
        int counter = 0;
        for(int i = 0; i < arrayIn.length; i++){
            char[]chars = arrayIn[i].toCharArray();
            if(isCharDigit(chars[0])){
                counter++;
            }
        }
        System.out.println();
        System.out.println("amount of numbers : "+counter);
    }

    private static boolean isCharDigit(char ch){
        boolean isDigit = false;
        if((int)ch>47 && (int)ch < 58){
            isDigit = true;
        }
        return isDigit;
    }
}
