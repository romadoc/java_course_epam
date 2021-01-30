package com.epam.moduletwo.arraysofarrays;

/**
 * Найти положительные элементы главной диагонали квадратной матрицы.
 * task 10:  https://learn.epam.com/myLearning/program?groupGuid=df7fb55b-0efc-452b-9509-aa8160990adb
 */
public class Main10 {
    public static void main(String[] args) {
        int[][] array = createMatrix();;
        int[] arrayOfDesition = matrixForDesition(array);;

        printMatrix(array);
        printDisition(arrayOfDesition);
    }

    private static int[][] createMatrix() {
        int[][]  array = new int[6][6];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int)(Math.random() * 20 - 10);
            }
        }
        return array;
    }

    private static int[] matrixForDesition(int [][] arrayIn) {
        int[] disition = new int[arrayIn.length];
        for (int i = 0; i < arrayIn.length; i++) {
            for(int j = 0; j < arrayIn[i].length; j++) {
                disition[i] = arrayIn[i][i];
            }
        }
        return disition;
    }

    private static void printMatrix(int[][] arrayIn) {
        for (int i = 0; i < arrayIn.length; i++){
            for(int j = 0; j < arrayIn[i].length; j++) {
                System.out.print(arrayIn[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static void printDisition(int[]arrayOfDesition) {
        System.out.println();
        System.out.print("Positive digits of main diagonal: ");
        for (int i = 0; i < arrayOfDesition.length; i++ ) {
            if (arrayOfDesition[i] > 0) {
                System.out.print(arrayOfDesition[i] + "; ");
            }
        }
    }
}
