package com.epam.moduletwo.arrayssimple;

//Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.

public class Main4 {
    public static void main(String[] args) {
        int minNum = Integer.MAX_VALUE;
        int minIndex = 0;

        int maxNum = Integer.MIN_VALUE;
        int maxIndex = 0;

        int[] massive = new int[20];

        System.out.println("original massive:");

        for (int i = 0; i < massive.length; i++) {
            massive[i] = (int) (Math.random()*200 - 100);
            System.out.print(" " + massive[i] + "; ");
        }
        System.out.println();
        System.out.println();

        for (int i = 0; i < massive.length; i++){
            if (maxNum < massive[i]){
                maxNum = massive[i];
                maxIndex = i;

            }
        }
        System.out.print("max element's index =  " + maxIndex+", max element "+maxNum+"; ");

        for (int i = 1; i < massive.length; i++){
            if (minNum > massive[i]){
                minNum = massive[i];
                minIndex = i;
            }
        }
        System.out.print("/ min element's index = " + minIndex +", min element "+ minNum +"; ");
        massive[minIndex] = maxNum;
        massive[maxIndex] = minNum;
        System.out.println();
        System.out.println("transformed massive. elements [max] & [min] are changed: ");
        for (int i = 0; i < massive.length; i++) {
            System.out.print(" " + massive[i] + "; ");
        }
    }
}
