package com.epam.moduletwo.arrayssimple;

//Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
//элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.

import java.util.Arrays;

public class Main10 {
    public static void main(String[] args) {
        int [] testArray = createArray();
        System.out.print("output array: " + Arrays.toString(compressOfArray(testArray)));
    }
    private static int[] createArray(){
        int[] array = new int[10];
        System.out.print("created array: ");
        for (int i = 0; i < array.length; i++){
            int elem;
            elem = (int)(Math.random()*20);
            array[i] = elem;
            System.out.print(array[i] + "; ");
        }
        System.out.println();
        return array;
    }
    private static int [] compressOfArray(int[]inputArray){
        for(int i = 0; i <inputArray.length/2; i++){
            inputArray[i] = inputArray[i*2];
        }
        for (int i = inputArray.length/2; i<inputArray.length; i++ ){
            inputArray[i] = 0;
        }
        return inputArray;
    }
}