package com.epam.moduletwo.sorting;

/**
 * Реализуйте сортировку выбором.
 * Task2: https://learn.epam.com/myLearning/program?groupGuid=df7fb55b-0efc-452b-9509-aa8160990adb
 */
public class Main2 {
    public static void main(String[] args) {
        printArray(createArray(), "start array: ");
        printArray(sortArray(createArray()), "result: ");

    }

    private static int[] createArray() {
        int[]array1 = {30, 30, 25, 20, 15, 15, 10, 8, 7, 1};
        return array1;
    }

    private static void printArray(int[]arrayIn, String s) {
        System.out.println();
        System.out.print(s);
        for (int elem:  arrayIn) {
            System.out.print(elem + "; ");
        }
    }

    private static int[] sortArray(int[]arrayIn) {
        for (int i = 0; i < arrayIn.length; i++) {
            int min = arrayIn[i];
            int minId = i;
            for (int j = i + 1; j < arrayIn.length; j++) {
                if (arrayIn[j]<min){
                    min = arrayIn[j];
                    minId = j;
                }
            }
            int temp = arrayIn[i];
            arrayIn[i] = min;
            arrayIn[minId] = temp;
        }
        return arrayIn;
    }
}
