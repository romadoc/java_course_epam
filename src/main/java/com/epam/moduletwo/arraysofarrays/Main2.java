package com.epam.moduletwo.arraysofarrays;

//Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

public class Main2 {
    public static void main(String[] args) {
        typeDiagonal(createMatrix());
    }

    private static int[][] createMatrix() {
        int[][] array = new int[4][4];

        System.out.println("Generated Matrix: ");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int element = (int) (Math.random() * 10);
                array[i][j] = element;
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        return array;
    }

    private static void typeDiagonal(int[][] arrayInput) {
        System.out.print("Digits on diagonal(main): ");

        for (int i = 0; i < arrayInput.length; i++) {
            System.out.print(arrayInput[i][i] + "; ");
        }
        System.out.println();
        System.out.print("Digits of secondary diagonal: ");

        for (int i = 0; i < arrayInput.length; i++ ) {
             System.out.print(arrayInput[i][arrayInput.length - 1 - i] + "; ");

        }
    }
}
