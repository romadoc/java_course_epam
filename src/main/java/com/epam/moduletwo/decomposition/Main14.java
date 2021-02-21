package com.epam.moduletwo.decomposition;

import com.epam.utils.ScannerUtil;

/**
 * Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
 * возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
 * использовать декомпозицию.
 * task 14: https://learn.epam.com/myLearning/program?groupGuid=df7fb55b-0efc-452b-9509-aa8160990adb
 */
public class Main14 {
    public static void main(String[] args) {
        int k = ScannerUtil.integerIn("Type k");
        getSolution(k);
    }

    private static int countDigits(int x) {
        int n = x;
        int countDigits = 0;
        for (; n != 0; n = n / 10) {
            countDigits++;
        }
        return countDigits;
    }

    private static int[] createArrayOfDigits(int k, int digLenght) {
        int number = k;
        int[] array = new int[digLenght];//длина массива = количество цифр в числе "к"
        for (int i = 0; i < array.length; i++) {
            int rezult = 0;
            rezult = number % 10;
            number = number / 10;
            array[i] = rezult;
        }
        return array;
    }

    private static void getSolution(int k) {
        System.out.print("Amstrong's digits: ");
        for(int i = 0; i <= k; i++){
            int[]arraySubTemp = createArrayOfDigits(i, countDigits(i));
            double sum = 0;
            for (int j = 0; j < arraySubTemp.length; j++) {
                sum =  (Math.pow(arraySubTemp[j], countDigits(i))) + sum;
            }
            if(sum == i) {
                System.out.print(i + "; ");
            }
        }
    }
}
