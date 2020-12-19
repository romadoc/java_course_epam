package com.epam.moduletwo.arraysofarrays;

//Дана матрица. Вывести k-ю строку и p-й столбец матрицы

import com.epam.moduletwo.utils.ScannerUtil;
public class Main3 {
    public static void main(String[] args) {
        int [][] array;
        array = createMatrix();
        int lineNumber = ScannerUtil.integerIn("line number (positive integer)");
        int columnNumber = ScannerUtil.integerIn("Column number(positive integer)");
        printOutLine(lineNumber, columnNumber, array);
    }

    private static int[][] createMatrix(){
        int n;
        n = (int)(Math.random()*10);
        int [][] array = new int[n][n];
        System.out.println("Generated Matrix");
        for (int i = 0; i < array.length; i++){

            for (int j = 0; j < array[i].length; j++){
                array[i][j] = (int)(Math.random()*20);
                System.out.print(array[i][j] + "\t");

            }

            System.out.println();
        }
        return array;
    }

    private static void printOutLine(int x, int y, int [][]arrayInput){
        System.out.print("selected line: ");
        for (int i = 0; i < arrayInput.length; i++){

            System.out.print(arrayInput[x][i] + "; ");

        }
        System.out.println();
        System.out.print("selected column: ");
        for (int i = 0; i < arrayInput.length; i++){

            System.out.print(arrayInput[i][y] + "; ");

        }
    }
}
