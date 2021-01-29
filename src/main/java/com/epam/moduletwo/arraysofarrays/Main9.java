package com.epam.moduletwo.arraysofarrays;

/**
 * Задана матрица неотрицательных чисел.
 * Посчитать сумму элементов в каждом столбце. Определить, какой столбец содержит максимальную сумму.
 * task 9: https://learn.epam.com/myLearning/program?groupGuid=df7fb55b-0efc-452b-9509-aa8160990adb
 */
public class Main9 {
    public static void main(String[] args) {
        int[][] array;
        array = createMatrix();
        printMatrix(array);
        determinColumnWithMaxSumOfElements(array);

    }
    private static int[][] createMatrix(){
        int n;
        n = 5;
        int[][]array = new int[n][n];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = (int)(Math.random()*10);
            }
        }
        return array;
    }
    private static void printMatrix(int [][] arrayIn){
        for (int i = 0; i < arrayIn.length; i++){
            for (int j = 0; j < arrayIn[i].length; j++){
                System.out.print(arrayIn[i][j] + "\t");
            }
            System.out.println();
        }
    }
    private static void determinColumnWithMaxSumOfElements(int[][] array){
        int[] countSum = new int[array.length];
        int maxDigit;
        int maxCol;
        maxDigit = countSum[0];
        maxCol = 0;

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                countSum[j] = countSum[j] + array[i][j];
            }
        }
        for (int i = 0; i < countSum.length; i++){
            System.out.print(countSum[i] + "; ");
            if (maxDigit < countSum[i]){
                maxDigit = countSum[i];
                maxCol = i;
            }
        }
        System.out.println();
        System.out.print("max sum in column (index of column): " + maxCol);
    }
}
