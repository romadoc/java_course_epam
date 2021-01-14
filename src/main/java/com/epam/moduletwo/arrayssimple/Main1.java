package com.epam.moduletwo.arrayssimple;

import com.epam.utils.ScannerUtil;

//В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

public class Main1 {
    public static void main(String[] args) {

        fillingArray();
    }

    static void fillingArray() {
        int[] arrayOfInteger = new int[ScannerUtil.integerIn("Type length of array (positive integer)")];
        for (int i = 0; i < arrayOfInteger.length; i++) {
            arrayOfInteger[i] = i + 1;
        }
        printResult(arrayOfInteger, ScannerUtil.integerIn("Type K (integer)"));
    }

    private static void printResult(int[] array, int a) {
        System.out.println("числа, кратные К (при К = "+a+"): ");
        int sum = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] % a == 0) {
                System.out.print(" " + array[j] + "; ");
                sum = sum + array[j];
            }
        }
        System.out.println();
        System.out.println("sum is "+sum);
    }
}