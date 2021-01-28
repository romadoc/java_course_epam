package com.epam.moduletwo.arraysofarrays;

/**
 * Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
 * Task 15: https://learn.epam.com/myLearning/program?groupGuid=df7fb55b-0efc-452b-9509-aa8160990adb
 */
public class Main15 {
    public static void main(String[] args) {
        int[][] array = createMatrix();
        int maxElem;
        printMatrix(array);
        maxElem = findMaxElement(array);
        printMatrix(replaceOddsWithFoundElement(array, maxElem));
    }

    private static int[][] createMatrix() {
        int[][] array = new int[6][6];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 20);
            }
        }
        return array;
    }

    private static void printMatrix(int[][] array) {
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static int findMaxElement(int[][] arrayIn) {
        int[][] array = arrayIn;
        int maxD = Integer.MIN_VALUE;
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length - 1; j++) {
                if (maxD < array[i][j + 1]) {
                    maxD = array[i][j + 1];
                }
            }
        }

        System.out.print("max = " + maxD + "; ");
        return maxD;
    }

    private static int[][] replaceOddsWithFoundElement(int[][] arrayIn, int x) {
        int[][] array = arrayIn;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 != 0) {
                    array[i][j] = x;
                }
            }
        }
        return array;
    }
}
