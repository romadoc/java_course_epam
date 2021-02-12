package com.epam.moduletwo.arraysofarrays;

/**
 * Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
 * Task 13: https://learn.epam.com/myLearning/program?groupGuid=df7fb55b-0efc-452b-9509-aa8160990adb
 */
public class Main13 {
    public static void main(String[] args) {
        int array[][];
        array = createMatrix();
        printMatrix(array);
        printMatrix(sortMatrixColumnInDownOrder(array));
        printMatrix(sortMatrixColumnsInUpOrder(array));

    }
    private static int [][] createMatrix(){
        int [][] array = new int[6][6];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = (int)(Math.random()*10);
            }
        }
        System.out.println("generated array:");
        return array;
    }
    private static void printMatrix(int [][] arrayIn){
        for (int i = 0; i < arrayIn.length; i++){
            for (int j = 0; j < arrayIn[i].length; j++){
                System.out.print(arrayIn[i][j] + "\t");
            }
            System.out.println();
        }
    }
    private static int[][] sortMatrixColumnInDownOrder(int [][] arrayIn){
        int[][]array = arrayIn;
        for (int i = 0; i < arrayIn.length; i++) {
            for (int j = 0; j < arrayIn[i].length; j++) {
                for (int y = 0; y < array[i].length - 1; y++) {
                    if (array[y][j] > array[y + 1][j]) {
                        int temp = array[y][j];
                        array[y][j] = array[y + 1][j];
                        array[y + 1][j] = temp;
                    }
                }

            }
        }
        System.out.println("sorted array's column min to max: ");
        return array;
    }
    private static int[][] sortMatrixColumnsInUpOrder(int[][] arrayIn){
        int[][] array = arrayIn;
        for (int i = 0; i < arrayIn.length; i++) {
            for (int j = 0; j < arrayIn[i].length; j++) {
                for (int y = 0; y < array[i].length - 1; y++) {
                    if (array[y][j] < array[y + 1][j]) {
                        int temp = array[y][j];
                        array[y][j] = array[y + 1][j];
                        array[y + 1][j] = temp;
                    }
                }

            }
        }
        System.out.println("sorted array's column max to min: ");
        return array;
    }

}
