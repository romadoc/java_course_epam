package com.epam.moduletwo.arraysofarrays;

//Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

public class Main1 {
    public static void main(String[] args) {
        decideTask(arrayCreation());
    }
    private static int[][] arrayCreation(){
        int[][] array = {
                {9, 2, 3, 4, 5},
                {3, 4, 6, 7, 8 },
                {2, 4, 6, 7, 8 },
                {3, 4, 6, 2, 8 },
                {3, 4, 6, 7, 1 },
        };
        return array;
    }
    private static void decideTask(int[][] arrayIn){
        for (int i = 0; i < arrayIn.length; i++){
            for (int j = 0; j<arrayIn[i].length; j += 2){
                if (arrayIn[0][j] > arrayIn[arrayIn.length-1][j] ) {
                    System.out.print(arrayIn[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }
}
