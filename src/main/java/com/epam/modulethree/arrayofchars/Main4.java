package com.epam.modulethree.arrayofchars;

/**
 * в строке найти количество чисел
 * task 4 https://learn.epam.com/myLearning/program?groupGuid=df7fb55b-0efc-452b-9509-aa8160990adb
 */
public class Main4 {
    public static void main(String[] args) {
        String testString = "in this 22 string 5 there 88 are 4 digits 33";
        String[] creator = createArray(testString);
        System.out.println("string for counting: " + testString);
        findAndCountNumbers(creator);
    }

    private static String[] createArray(String s) {
        return s.split(" ");
    }

    private static void findAndCountNumbers(String[]arrayIn) {
        int counter = 0;
        for (String s : arrayIn) {
            char[] chars = s.toCharArray();
            if (isCharDigit(chars[0])) {
                counter++;
            }
        }
        System.out.println();
        System.out.println("amount of numbers : "+counter);
    }

    private static boolean isCharDigit(char ch) {
        boolean isDigit = false;
        if((int)ch > 47 && (int)ch < 58) {
            isDigit = true;
        }
        return isDigit;
    }
}
