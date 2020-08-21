package module2.part2_multi_massive;

/*
В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
пользователь с клавиатуры.
 */

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        int[][] array;
        int[][] transformedArray;
        array = matrixConstructor();
        printMatrix(array);
        String s1;
        String s2;
        s1="Column one >>";
        s2="Column two >>";

        int x;
        int y;
        x = inputColumn(array,s1);
        y = inputColumn(array, s2);
        transformedArray = transformMatrix(array,x,y);
        printMatrix(transformedArray);


    }
    private static int [][] matrixConstructor(){
        int [][]array = new int[5][5];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = (int)(Math.random()*10);
            }
        }
        return array;
    }
    private static int inputColumn(int [][] array, String s){
        int x;
        x = 0;
        System.out.print(s);
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()){
            scanner.next();
            System.out.println();
            System.out.print(s);
        }
        int y = scanner.nextInt();
        if (y > 0 && y < array.length) {
            x = y;
        }

        return x;
    }
    private static void printMatrix(int[][] arrayIn){
        for(int i = 0; i < arrayIn.length; i++){
            for (int j = 0; j < arrayIn[i].length; j++){
                System.out.print(arrayIn[i][j] + "\t");
            }
            System.out.println();
        }
    }
    private static int[][] transformMatrix(int[][] arrayIn, int x, int y){
        int[]arrayX = new int[arrayIn.length];
        int[]arrayY = new int[arrayIn.length];
        System.out.println();
        for (int i = 0; i < arrayIn.length; i++){
            for (int j = 0; j < arrayIn[i].length; j++){
                arrayX[i] = arrayIn[i][x];
                arrayY[i] = arrayIn[i][y];
                arrayIn[i][x] = arrayY[i];
                arrayIn[i][y] = arrayX[i];

            }

        }
        return arrayIn;
    }
}
