package com.epam.moduletwo.arraysofarrays;

/**
 * Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
 * Task 12: https://learn.epam.com/myLearning/program?groupGuid=df7fb55b-0efc-452b-9509-aa8160990adb
 */
public class Main12 {
    public static void main(String[] args) {
        int[][] array = createMatrix();
        printMatrix(array);
        printMatrix(sortMatrixInUpOrder(array));
        printMatrix(sortMatrixInDownOrder(array));
    }

    private static int[][] createMatrix() {
        int[][] array = new int[6][6];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }
        System.out.println("generated array");
        return array;
    }

    private static int[][] sortMatrixInUpOrder(int[][] array) {

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length - 1; j++) {
                for (int y = 0; y < array[i].length; y++) {

                    if (array[y][j] > array[y][j + 1] ) {
                        int tmp = array[y][j];
                        array[y][j] = array[y][j + 1];
                        array[y][j + 1] = tmp;
                    }
                }
            }
        }

        System.out.println();
        System.out.println("sorted up array:");
        return array;
    }

    private static int[][] sortMatrixInDownOrder(int[][] arrayIn) {
        int[][] array = arrayIn;
        for (int i = 0; i < arrayIn.length; i++) {
            for (int j = 0; j < arrayIn[i].length - 1; j++) {
                for (int y = 0; y < array[i].length; y++) {
                    if (array[y][j] < array[y][j + 1] ) {
                        int tmp = array[y][j];
                        array[y][j] = array[y][j + 1];
                        array[y][j + 1] = tmp;
                    }
                }
            }
        }

        System.out.println("sorted down array:");
        return array;
    }

    private static void printMatrix(int[][] arrayIn) {

        for (int i = 0; i < arrayIn.length; i++) {
            for (int j = 0; j < arrayIn[i].length; j++) {
                System.out.print(arrayIn[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
