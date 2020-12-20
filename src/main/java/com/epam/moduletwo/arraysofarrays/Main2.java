package com.epam.moduletwo.arraysofarrays;

//Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

public class Main2 {
    public static void main(String[] args) {
        typeDiagonal(createMatrix());
    }

    private static int[][] createMatrix() {
        int x;
        x = (int) (Math.random()*10);
        int[][] array = new int[x][x];

        System.out.println("Generated Matrix: ");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int element = (int) (Math.random() * 20);
                array[i][j] = element;
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        return array;
    }

    private static void typeDiagonal(int[][] arrayInput) {
        System.out.print("Digits on diagonal: ");
        int n = 0;
        for (int i = 0; i < arrayInput.length; i++) {
            for (int j = 0; j < arrayInput[i].length; j++) {
                System.out.print(arrayInput[i + n][j] + "; ");
                n++;
            }
            if (n == arrayInput.length) break;

        }
    }
}