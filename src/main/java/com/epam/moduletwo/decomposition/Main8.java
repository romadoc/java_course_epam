package com.epam.moduletwo.decomposition;

/**
 * Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
 * Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
 * массива с номерами от k до m.
 * task 8 : https://learn.epam.com/myLearning/program?groupGuid=df7fb55b-0efc-452b-9509-aa8160990adb
 */
public class Main8 {
    public static void main(String[] args) {
        int[]array = createArray();
        printData(array, "starting array");
        int sum1;
        int sum2;
        int sum3;
        sum1 = getSumOfGaps(array, 1, 3);
        sum2 = getSumOfGaps(array, 3, 5);
        sum3 = getSumOfGaps(array, 4, 6);
        printData(sum1, "1-3");
        printData(sum2, "3-5");
        printData(sum3, "4-6");
    }
    private static int[] createArray(){
        int[]array = new int[10];
        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*10);

        }
        return array;
    }
    private static void printData(int[]arrayIn, String s){
        System.out.print(s + ": ");
        for (int elem: arrayIn) {
            System.out.print(elem + "; ");
        }
    }
    private static void printData(int sum, String s){
        System.out.println();
        System.out.print("sum of elements at indexes [" + s + "]: " + sum);

    }
    private static int getSumOfGaps(int[]arrayIn, int start, int end){
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum = sum + arrayIn[i];
        }
        return sum;
    }
}
