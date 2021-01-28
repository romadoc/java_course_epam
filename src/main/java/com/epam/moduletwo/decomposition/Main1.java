package com.epam.moduletwo.decomposition;

/**
 * Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
 * натуральных чисел: НОК(А,В)=А*В/НОД(А,В)
 * task1 : https://learn.epam.com/myLearning/program?groupGuid=df7fb55b-0efc-452b-9509-aa8160990adb
 */
public class Main1 {
    public static void main(String[] args) {
        int a = 12;
        int b = 9;
        int greatCommonDivider;
        greatCommonDivider = countGreatCommonDev(a, b);
        printResult(a, b);
        printResult("great common divider", greatCommonDivider);
        int leastCommonMultiple;
        leastCommonMultiple = countLeastCommonMultiple(a, b, greatCommonDivider);
        printResult("least common multiple", leastCommonMultiple);
    }

    private static int countGreatCommonDev(int a, int b) {
        int d = 0;
        while (a != 0 && b !=0){
            if(a>b) {
                a = a % b;
            } else {
                b = b % a;
            }
            d = a + b;
        }

        return d;
    }

    private static int countLeastCommonMultiple(int a, int b, int grComDiv) {
        int x;
        x = (a*b)/grComDiv;
        return x;
    }

    private static void printResult(String s, int a) {
        System.out.println();
        System.out.print(s + ": " + a);
    }

    private static void printResult(int a, int b) {
        System.out.println();
        System.out.print("checked digits" + ": " + a + "; " + b);
    }
}
