package com.epam.moduletwo.sorting;

/**
 * Реализуйте сортировку обменами.
 * Task3 : https://learn.epam.com/myLearning/program?groupGuid=df7fb55b-0efc-452b-9509-aa8160990adb
 */
public class Main3 {
    public static void main(String[] args) {
        int[]array;
        array = createArray();
        printArray(array, "start array: ");
        printArray(sortArray(array), "sorted array: ");

    }
    private static int[] createArray(){
        int b = (int)(Math.random()*10);
        int[]array = new int[b];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*20);
        }
        return array;
    }
    private static void printArray(int[]arrayIn, String s){
        System.out.println();
        System.out.print(s);
        for (int elem: arrayIn) {
            System.out.print(elem + "; ");
        }
    }
    private static int[] sortArray(int[]arrayIn){
        int count = 0;
        for (int i = 0; i < arrayIn.length; i++){

            for (int j = i+1; j < arrayIn.length; j++){
                if(arrayIn[i] > arrayIn[j]){
                    int temp;
                    temp = arrayIn[i];
                    arrayIn[i] = arrayIn[j];
                    arrayIn[j] = temp;
                    count++;

                }
            }
        }
        System.out.print("count of changing: " + count);
        return arrayIn;
    }

}
