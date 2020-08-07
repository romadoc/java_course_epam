package module2.part1_massive_simple;

//Даны действительные числа a1, a2,...an найти мах суммы парных чисел. задача 7, модуль 2, раздел 1

public class Main7 {
    public static void main(String[] args) {
        int[] massive = arrayGenerator();

        System.out.print("geberated array: ");
        for (int elem: massive){
            System.out.print(" " + elem + "; ");
        }
        System.out.println();

        maxFinder(pairFinder(massive));

    }

    private static int[] arrayGenerator() {
        int n;
        n = (int) (Math.random() * 20);
          if (n % 2 != 0) {
              n = n + 1;
              }
        int[] massive = new int[n];
        for (int i = 0; i < massive.length; i++) {
            massive[i] = (int) (Math.random() * 10);
        }
        return massive;
    }

    private static int[] pairFinder(int[] massive) {

        int [] arrayForCount = new int[massive.length/2];
        int pairSum;
        int pSumIndex;
        pSumIndex = 0;
        for (int i = 0; i < massive.length; i++) {
            pairSum = massive[i] + massive[i+1];
            arrayForCount[pSumIndex] = pairSum;
            pSumIndex ++;
            i = i + 1;
        }
        System.out.println();
        System.out.print("final array: ");
        for (int y = 0; y < arrayForCount.length; y++){
            System.out.print(" " + arrayForCount[y] + "; ");
        }
        return arrayForCount;
    }

    private static void maxFinder(int [] sourseArray) {
        int max;
        max = sourseArray[0];
        for (int i = 0; i < sourseArray.length; i ++){
            if (max < sourseArray[i]) max = sourseArray[i];
        }
        System.out.println();
        System.out.print("max sum of presented pairs is: " + max);
    }
}

