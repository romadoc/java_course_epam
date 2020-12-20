package com.epam.moduletwo.decomposition;

import com.epam.utils.ScannerUtil;

/**
 * Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
 * task 6 : https://learn.epam.com/myLearning/program?groupGuid=df7fb55b-0efc-452b-9509-aa8160990adb
 */
public class Main6 {
    public static void main(String[] args) {
        int aDigit;
        int bDigit;
        int cDigit;
        aDigit = ScannerUtil.integerIn("type \"a\"");
        bDigit = ScannerUtil.integerIn("type \"b\"");
        cDigit = ScannerUtil.integerIn("type \"c\"");
        getResult(aDigit, bDigit, cDigit);
    }

    private static int greatCommonFinder(int a, int b){
        int rezult = 0;
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
            rezult = a + b;
        }

        return rezult;
    }

    private static void getResult(int a, int b, int c){
        String s = "Answer: ";
        if (greatCommonFinder(greatCommonFinder(a, b), c) == 1){
            s = s + "These numbers are inter-prime";
        }else {
            s = s + "These numbers are not inter-prime";
        }
        System.out.println(s);
    }
}
