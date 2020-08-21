package module2.part2_multi_massive;

/*
     Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
     столбец содержит максимальную сумму.
 */

public class Main9 {
    public static void main(String[] args) {
        int[][] array;
        array = matrixConstructor();
        printResult(array);
        counter(array);

    }
    private static int[][] matrixConstructor(){
        int n;
        n = 5;
        int[][]array = new int[n][n];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = (int)(Math.random()*10);
            }
        }
        return array;
    }
    private static void printResult(int [][] arrayIn){
        for (int i = 0; i < arrayIn.length; i++){
            for (int j = 0; j < arrayIn[i].length; j++){
                System.out.print(arrayIn[i][j] + "\t");
            }
            System.out.println();
        }

    }
    private static void counter(int[][] array){
        int[] countSum = new int[array.length];
        int maxDigit;
        int maxCol;
        maxDigit = countSum[0];
        maxCol = 0;

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                countSum[j] = countSum[j] + array[i][j];
            }

        }
        for (int i = 0; i < countSum.length; i++){
            System.out.print(countSum[i] + "; ");
            if (maxDigit < countSum[i]){
                maxDigit = countSum[i];
                maxCol = i;
            }
        }
        System.out.println();
        System.out.print("max sum in column (index): " + maxCol);
    }
}
