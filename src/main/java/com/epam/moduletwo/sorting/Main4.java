package com.epam.moduletwo.sorting;

import java.util.Arrays;

/**
 * Реализуйте сортировку вставками.
 * Task4 : https://learn.epam.com/myLearning/program?groupGuid=df7fb55b-0efc-452b-9509-aa8160990adb
 */
public class Main4 {
    public static void main(String[] args) {
       int[]array = createArray();
       printArray("Generated array: ", array);
       printArray("Sorted array: ", insertionSort(array));
    }

    private static int[] insertionSort(int[] arrayIn) {
        for (int left = 0; left < arrayIn.length; left++) {
            int value = arrayIn[left];
            int i = left - 1;

            for (; i >= 0; i--) {
                if (value < arrayIn[i]) {
                    arrayIn[i + 1] = arrayIn[i];
                } else {
                    break;
                }
            }
            arrayIn[i + 1] = value;
        }
        return arrayIn;
    }

    private static int[] createArray() {
        int b = (int)(10+Math.random()*20);
        int[]array = new int[b];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*100);
        }
        return array;
    }

    private static void printArray(String s, int[]arrayIn) {
        System.out.println(s);
        for (int a: arrayIn  ) {
            System.out.print(a + "; ");
        }
        System.out.println();
    }

}
