package com.epam.moduletwo.arraysofarrays;

//Дана матрица. Вывести k-ю строку и p-й столбец матрицы

import com.epam.utils.ScannerUtil;
public class Main3 {

    public static void main(String[] args) {
        int n = (int)(Math.random() * 10);
        int m = (int)(Math.random() * 10);
        int [][] array = createMatrix(n, m);
        int lineNumber = ScannerUtil.integerIn("Enter line number (positive integer)");
        int columnNumber = ScannerUtil.integerIn("Enter column number(positive integer)");
        printOutLine(lineNumber, columnNumber, array, m);
    }

    private static int[][] createMatrix(int n, int m) {

        int [][] array = new int[n][m];
        System.out.println("Generated Matrix");
        for (int i = 0; i < array.length; i++){

            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int)(Math.random() * 20);
                System.out.print(array[i][j] + "\t");

            }

            System.out.println();
        }
        return array;
    }

    private static void printOutLine(int lineNum, int coloumnNum, int [][]arrayInput, int m) {
        System.out.print("selected line: ");
        for (int i = 0; i < m; i++) {
            System.out.print(arrayInput[lineNum][i] + "; ");
        }
        System.out.println();
        System.out.print("selected column: ");
        for (int i = 0; i < arrayInput.length; i++) {

            System.out.print(arrayInput[i][coloumnNum] + "; ");

        }
    }
}
