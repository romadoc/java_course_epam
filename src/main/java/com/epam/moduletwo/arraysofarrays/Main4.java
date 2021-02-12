package com.epam.moduletwo.arraysofarrays;

/** Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
    https://learn.epam.com/myLearning/program?groupGuid=df7fb55b-0efc-452b-9509-aa8160990adb task 4
*/

public class Main4 {
    public static void main(String[] args) {

        printMatrix(createMatrix());

    }
    private static int[][] createMatrix() {
        int x = 10;
        int[][] array = new int[x][x];
        int n = 10;
        int n1 = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j = j + 2) {
                array[j][i] = n1;
            }
            n1++;
            for (int y = 1; y < array[i].length; y = y + 2) {
                array[y][i] = n;
            }
            n--;
        }
        return array;
    }

    private static void printMatrix(int[][] arrayIn ) {
        for (int i = 0; i < arrayIn.length; i++) {
            for (int j = 0; j < arrayIn[i].length; j++) {
                System.out.print(arrayIn[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
