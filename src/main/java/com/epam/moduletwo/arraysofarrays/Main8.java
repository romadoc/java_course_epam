package com.epam.moduletwo.arraysofarrays;

import com.epam.utils.ScannerUtil;

/**
 * В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить на
 * соответствующие им позиции другого, а его элементы второго переместить в первый.
 * Номера столбцов вводит пользователь с клавиатуры.
 * task 8: https://learn.epam.com/myLearning/program?groupGuid=df7fb55b-0efc-452b-9509-aa8160990adb
 */
public class Main8 {
    public static void main(String[] args) {
        int[][] array = createMatrix();;
        int[][] transformedArray;
        printMatrix(array);

        int columnNumberOne = ScannerUtil.integerIn("enter the number of one column");
        int columnNumberTwo = ScannerUtil.integerIn("enter another column number");
        transformedArray = transformMatrix(array, columnNumberOne, columnNumberTwo);

        printMatrix(transformedArray);
    }
    private static int [][] createMatrix() {
        int[][]array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int)(Math.random()*10);
            }
        }
        return array;
    }

    private static void printMatrix(int[][] arrayIn) {
        for(int i = 0; i < arrayIn.length; i++) {
            for (int j = 0; j < arrayIn[i].length; j++) {
                System.out.print(arrayIn[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static int[][] transformMatrix(int[][] arrayIn, int x, int y) {
        int[]arrayX = new int[arrayIn.length];
        int[]arrayY = new int[arrayIn.length];
        System.out.println();
        for (int i = 0; i < arrayIn.length; i++) {
            for (int j = 0; j < arrayIn[i].length; j++) {
                arrayX[i] = arrayIn[i][x];
                arrayY[i] = arrayIn[i][y];
                arrayIn[i][x] = arrayY[i];
                arrayIn[i][y] = arrayX[i];
            }
        }
        return arrayIn;
    }
}
