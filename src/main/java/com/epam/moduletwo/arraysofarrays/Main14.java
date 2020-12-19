package com.epam.moduletwo.arraysofarrays;

/**
 * Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
 * причем в каждом столбце число единиц равно номеру столбца.
 * Task 14 :  https://learn.epam.com/myLearning/program?groupGuid=df7fb55b-0efc-452b-9509-aa8160990adb
 */
public class Main14 {
    public static void main(String[] args) {
        int[][] array = createMatrix();
        printMatrix(array);
    }
    private static int[][] createMatrix(){
        int m;
        int n;
        m = (int)(3+Math.random()*6);
        n = (int)(2+Math.random()*6);

        int[][]array = new int[m][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int y = 0; y < j ; y++) {
                    array[y][j] = 1;
                }
            }
        }
        return array;
    }
    private static void printMatrix(int[][] arrayIn) {
        for (int i = 0; i < arrayIn.length; i++){
            for(int j = 0; j < arrayIn[i].length; j++) {
                System.out.print(arrayIn[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
