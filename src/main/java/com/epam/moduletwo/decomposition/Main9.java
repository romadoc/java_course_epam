package com.epam.moduletwo.decomposition;

import com.epam.utils.ScannerUtil;

/**
 * Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
 * если угол между сторонами длиной X и Y— прямой.
 * task 9 : https://learn.epam.com/myLearning/program?groupGuid=df7fb55b-0efc-452b-9509-aa8160990adb
 */
public class Main9 {
    public static void main(String[] args) {
        int x = ScannerUtil.integerIn("type X");
        int y = ScannerUtil.integerIn("type Y");
        int z = ScannerUtil.integerIn("type Z");
        int t = ScannerUtil.integerIn("type K");
        printAnswer(getSquare(x, y, z, t));
    }

    private static double getSquare(int x, int z, int y, int t) {
        double diaqonal;
        diaqonal = Math.sqrt((x * x) + (y * y));
        double square1 = (x * y) / 2.0;
        double pSemiPerimetr = (diaqonal + z + t)/2.0;
        double square2 = Math.sqrt((pSemiPerimetr - z)*(pSemiPerimetr - diaqonal)*(pSemiPerimetr - t));
        square1 = square1 + square2;

        return square1;
    }
    private static void printAnswer(double square){
        System.out.println();
        System.out.println("square is " + square);
    }
}
