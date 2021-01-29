package com.epam.moduletwo.sorting;

/**
 * Реализуйте сортировку Шелла.
 * task 5 : https://learn.epam.com/myLearning/program?groupGuid=df7fb55b-0efc-452b-9509-aa8160990adb
 */
public class Main5 {
    public static void main(String[] args) {
        int[] array  = createArray();
        printArray(array, "start array");
        int[] arraySorted = sortArrayByShell(array);
        printArray(arraySorted, "sorted array");
    }
    private static int[] createArray(){
        int i;
        i = (int)(Math.random()*10);
        int[] array = new int[i];
        for(int j = 0; j < array.length; j++){
            array[j] = (int)(Math.random()*20);
        }
        return array;
    }
    private static void printArray(int[]arrayIn, String s){
        System.out.println(s + ": ");
        for (int elem: arrayIn) {
            System.out.print(elem + "; ");
        }
        System.out.println();
    }
    private static int[] sortArrayByShell(int[]arrayIn){
        int n;
        n = arrayIn.length/2;
        while (n>0){
            for (int i = 0; i < arrayIn.length - n; i++){
                int j = i;
                while ((j >= 0) && (arrayIn[j] > arrayIn[j + n])){
                    int temp;
                    temp = arrayIn[j];
                    arrayIn[j] = arrayIn[j + n];
                    arrayIn[j + n] = temp;
                    j--;
                }
            }
            n = n/2;
        }


        return arrayIn;
    }
}
