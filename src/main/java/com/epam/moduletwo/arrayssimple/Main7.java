package com.epam.moduletwo.arrayssimple;

import java.util.Arrays;
import java.util.Collections;

//Даны действительные числа a1, a2,...an найти мах суммы парных чисел.
// макс из а0+а1 ; а2 + а3;...
public class Main7 {
    public static void main(String[] args) {
        int[] massive = createArray();

        System.out.print("generated array: ");
        for (int elem: massive){
            System.out.print(" " + elem + "; ");
        }
        System.out.println();
       createAnswer(massive);
    }

    private static int[] createArray() {
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

    private static int[] createAnswer(int[] massive) {

        int [] arrayForCount = new int[massive.length/2];
        int pairSum;
        int pSumIndex;
        pSumIndex = 0;
        for (int i = 0; i < massive.length; i += 2) {
            pairSum = massive[i] + massive[i+1];
            arrayForCount[pSumIndex] = pairSum;
            pSumIndex ++;
        }
        System.out.print("final array: ");
        Arrays.sort(arrayForCount);
        System.out.println(Arrays.toString(arrayForCount));
        System.out.println("max sum of presented pairs is: " + arrayForCount[arrayForCount.length-1]);
        return arrayForCount;
    }
}
