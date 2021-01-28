package com.epam.moduletwo.arraysofarrays;

/**
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 *      1 1 1...1 1 1
 *      0 1 1...1 1 0
 *      0 0 1...1 0 0
 *      .........
 *      0 1 1...1 1 0
 *      1 1 1...1 1 1
 *     task 6:  https://learn.epam.com/myLearning/program?groupGuid=df7fb55b-0efc-452b-9509-aa8160990adb
 */
public class Main6 {
    public static void main(String[] args) {
        printMatrix(createMatrix());

    }
    private static int[][] createMatrix() {
        int n = 6;
        int [][] array = new int[n][n];
        int x = 0;
        int y = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = x; j < array[i].length-x; j++) {
                array[i][j] = 1;
            }
            x++;

        }
        for (int i = array.length-1; i >= array.length/2; i--) {
            for (int j = y; j < array[i].length-y; j++ ) {
                array[i][j] = 1;
            }
            y++;
        }

        return array;
    }

    private static void printMatrix(int[][] arrayInput) {
        for (int i = 0; i < arrayInput.length; i++){
            for(int j = 0; j < arrayInput[i].length; j++) {
                System.out.print(arrayInput[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
