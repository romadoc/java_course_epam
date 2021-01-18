package com.epam.modulethree.arrayofchars;

/**
 * В строке найти количество цифр.
 * task3 : https://learn.epam.com/myLearning/program?groupGuid=df7fb55b-0efc-452b-9509-aa8160990adb
 */
public class Main3 {
    public static void main(String[] args) {
        String s = "in this 22 string there are 4 digits 33 ";
        char[]chars = createArray(s);
        findAndCountDigitsInString(chars);

    }
    private static char[] createArray(String s){
        return s.toCharArray();
    }
    private static void findAndCountDigitsInString(char[]chars){
        int counter = 0;
        for (int i = 0; i < chars.length; i++){
            if(chars[i] >= '0' && chars[i] <= '9'){
                counter++;
            }
        }
        System.out.println("number of digits: " + counter);

    }

}
