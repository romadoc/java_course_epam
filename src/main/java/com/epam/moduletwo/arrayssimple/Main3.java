package com.epam.moduletwo.arrayssimple;

// Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
//положительных и нулевых элементов.

import com.epam.moduletwo.utils.ScannerUtil;

public class Main3 {
    static int countNegativeNumbers = 0;
    static int countPositiveNumbers = 0;
    static int countZeroNumbers = 0;

    public static void main(String[] args) {
        int[] array = arrayGenerator();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                countZeroNumbers = countZeroNumbers + 1;
            } else if (array[i] > 0) {
                countPositiveNumbers = countPositiveNumbers + 1;
            } else countNegativeNumbers = countNegativeNumbers + 1;

        }
        System.out.println("положительных элементов: " + countPositiveNumbers);
        System.out.println("нулевых элементов: " + countZeroNumbers);
        System.out.println("отрицательных элементов: " + countNegativeNumbers);
    }

    private static int[] arrayGenerator() {
        int n = ScannerUtil.integerIn("Enter the dimension of the array");
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 200 - 100);
            System.out.print(" " + array[i] + "; ");
        }
        System.out.println();
        return array;
    }
}
