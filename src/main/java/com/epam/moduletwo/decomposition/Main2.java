package com.epam.moduletwo.decomposition;

/**
 *  Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 *  task2: https://learn.epam.com/myLearning/program?groupGuid=df7fb55b-0efc-452b-9509-aa8160990adb
 */
public class Main2 {
    public static void main(String[] args) {
        int a, b, c, d;
        a = 12;
        b = 9;
        c = 15;
        d = 21;
        printData(a, b, c, d, "digits");
        printData(greatCommonDivFinder(a, b, c, d), "great common divider");
    }

    private static int greatCommonDev(int a, int b) {
        int d = 0;
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
            d = a + b;
        }

        return d;
    }

    private static int greatCommonDivFinder(int a, int b, int c, int d) {
        int gcd = 0;
        int[] array = {a, b, c, d};
        for (int i = 0; i < array.length - 1; i++) {
            gcd = greatCommonDev(array[i], array[i + 1]);
        }
        return gcd;
    }

    private static void printData(int x, String s) {
        System.out.println();
        System.out.print(s + ": " + x);
    }

    private static void printData(int a, int b, int c, int d, String s) {
        System.out.println();
        System.out.print(s + ": " + a + "; " + b + "; " + c + "; " + d);
    }
}
