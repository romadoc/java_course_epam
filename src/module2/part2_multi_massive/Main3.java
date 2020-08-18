package module2.part2_multi_massive;

//Дана матрица. Вывести k-ю строку и p-й столбец матрицы

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
    int x;
    int y;
    int [][] array;

    array = matrixGenerator();

    x = requestData(array, "type string number: ");
    y = requestData(array, "type column number: ");
    printOutLine(x, y, array);
    }

    private static int[][] matrixGenerator(){
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
    private static int requestData(int[][] arrayIn, String s){
        int x;
        System.out.print(s);
        Scanner scanner = new Scanner(System.in);
        while (! scanner.hasNextInt()){
            scanner.nextLine();
            System.out.print(s);
        }
        x = scanner.nextInt();
        if (x > arrayIn.length || x > arrayIn[0].length){
            scanner.nextLine();
            System.out.print(s);

        }
        return x;
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
