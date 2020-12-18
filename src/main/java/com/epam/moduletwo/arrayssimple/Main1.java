package com.epam.moduletwo.arrayssimple;

import com.epam.moduletwo.utils.ScannerUtil;

//В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

public class Main1 {
    public static void main(String[] args) {
      fillingArray();
    }
    static void fillingArray() {
        int a = (int)(1+Math.random()*51);
        int[] arrayOfInteger = new int[a];
        for (int i = 0; i < arrayOfInteger.length; i++) {
            arrayOfInteger[i] = i + 1;
        }
        printResult(arrayOfInteger, ScannerUtil.integerIn("Type K (integer)"));
    }
    private static void printResult(int[] array, int a) {
        System.out.println("числа, кратные К (при К = "+a+"): ");
        for (int j = 0; j < array.length; j++) {
            if (array[j] % a == 0) {
                System.out.print(" " + array[j] + "; ");
            }
        }
    }
}
