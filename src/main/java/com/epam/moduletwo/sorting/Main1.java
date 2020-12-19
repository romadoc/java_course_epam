package com.epam.moduletwo.sorting;

import java.util.Scanner;

/**
 * Заданы два одномерных массива с различным количеством элементов и натуральное число k.
 * Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого,
 * при этом не используя дополнительный массив.
 * Task1 : https://learn.epam.com/myLearning/program?groupGuid=df7fb55b-0efc-452b-9509-aa8160990adb
 */
public class Main1 {
    static int fill1Array = 10;

    public static void main(String[] args) {
        int k;
        int length1;
        int[] arrayFirst = createArrayOne();
        int[] arraySec = createArrayTwo();

        length1 = arrayFirst.length;
        k = inputK("Type K >>", length1);
        int[] comboArray = createCombinedMatrix(arrayFirst, arraySec, k);
        printArray(comboArray, "result: ");

    }
    private static int[] createArrayOne(){
        int n;
        int [] array = new int[50];
        for(int i = 0; i < fill1Array; i++){
            array[i] = i+1;

        }

        return array;
    }
    private static int[] createArrayTwo(){

        int [] array = new int[10];
        for(int i = 0; i < array.length; i++){
            array[i] = (i+1)*10;

        }
        return array;
    }
    private static int inputK(String s, int length){
        System.out.print(s);
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        int y = 0;
        while (!scanner.hasNextInt()){
            scanner.next();
            System.out.println();
            System.out.print(s);
        }

        x = scanner.nextInt();
        if (x > 0 && x < length){
            y = x;
        }

        System.out.println("k = " + y);
        return y;
    }
    private static void printArray(int [] arrayIn, String s){
        System.out.print(s);
        for (int i = 0; i < arrayIn.length; i++){
            System.out.print(arrayIn[i] + "; ");
        }
        System.out.println();
    }
    private static int[] createCombinedMatrix(int[]array1, int[]array2, int k){

        int coef = (fill1Array+array2.length) - (k+1);

        for (int j = k + 1; j < fill1Array; j++) {
            array1[coef] = array1[j];
            coef = coef + 1;

        }   for (int i = 0; i < array2.length; i++){

            array1[(k+1)+i] = array2[i];
        }
        return array1;

    }

}
