package com.epam.moduletwo.arraysofarrays;

/** Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
    1 1 1... 1 1 1
    2 2 2... 2 2 0
    3 3 3... 3 0 0
    n-1 n-1 0...0 0 0
    n 0 0... 0 0 0
 task 5:  https://learn.epam.com/myLearning/program?groupGuid=df7fb55b-0efc-452b-9509-aa8160990adb
*/

public class Main5 {
    public static void main(String[] args) {
        printMatrix(createMatrix());

    }

    private static int[][] createMatrix() {
        int n;
        n = 6;

        int [][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length-i; j++) {
                array[i][j] = i + 1;
            }

        }
        return array;
    }

    private static void printMatrix(int[][] arrayInput) {
        for (int i = 0; i < arrayInput.length; i++) {
            for (int j = 0; j < arrayInput[i].length; j++) {
                System.out.print(arrayInput[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
