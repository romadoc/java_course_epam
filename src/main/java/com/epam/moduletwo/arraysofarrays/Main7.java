package com.epam.moduletwo.arraysofarrays;

/**
 * сформировать квадратную матрицу порядка N по правилу:
 * A[I,J]=sin(I^2-J^2/N) и подсчитать количество положительных элементов в ней
 * task 7: https://learn.epam.com/myLearning/program?groupGuid=df7fb55b-0efc-452b-9509-aa8160990adb
 */
public class Main7 {
    public static void main(String[] args) {
        int positiveQuantity;
        double[][]array = createMatrix();
        positiveQuantity = countQuantityOfPositiveElements(array);
        printResult(array, positiveQuantity);

    }

    private static double[][] createMatrix() {
        int n = (int)(Math.random()*10);
        double[][]array = new double[n][n];

        for (int x = 0; x < array.length; x++) {
            for(int k = 0; k < array[x].length; k++) {
                int i = (int)(Math.random()*10);
                int j = (int)(Math.random()*10);
                double elem = ((i*i - j*j)/array.length);
                elem = Math.sin(elem);
                array[x][k] = elem;
            }
        }

        return array;
    }

    private static void printResult(double[][] arrayInput, int x) {
        for (int i = 0; i < arrayInput.length; i++){
            for (int j = 0; j < arrayInput[i].length; j++) {
                System.out.print(arrayInput[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.print("quantity of positive digits: " + x);
    }

    private static int countQuantityOfPositiveElements(double[][] arrayIn) {
        int q;
        q=0;
        System.out.println();
        for (int i = 0; i < arrayIn.length; i++){
            for(int j = 0; j < arrayIn[i].length; j++) {
                if (arrayIn[i][j] > 0) q++;
            }
        }

        return q;
    }
}
