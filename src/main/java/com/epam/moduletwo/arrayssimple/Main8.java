package com.epam.moduletwo.arrayssimple;

import java.util.ArrayList;
import java.util.Arrays;

//Дана последовательность целых чисел а1, а2,...а_n  Образовать новую последовательность, выбросив из
//исходной те члены, которые равны min (a1, a2, ..., a_n)
public class Main8 {
    public static void main(String[] args) {
        int[]workingArray =  {3, -5, -8, 6, -8, 10}; // working test
        int minElement;
        minElement = minElement(workingArray);
        printData("workindArray - изначальный массив: ", workingArray);
        printData("min - минимальное значение: ", minElement);
        int minQuantity;
        minQuantity = countOfMin(workingArray, minElement);
        printData("count - количество мин. элементов: ", minQuantity);
        ArrayList<Integer> outArray;
        outArray = newArrayCreator(workingArray, minElement);
        printData("Output digits: ", outArray);

    }

    private static int[] createArray(){
        int n = (int) (Math.random()* 20);
        int[] arrayFirst = new int[n];
        for (int i = 0; i < arrayFirst.length; i++) {
            arrayFirst[i] = (int) (Math.random() * 20 - 10);
        }
        return arrayFirst;
    }

    private static int minElement(int[] inputArray){
        int min;
        min = inputArray[0];
        for (int elem = 0; elem < inputArray.length; elem++){
            if (min > inputArray[elem]) {
                min = inputArray[elem];
            }
        }
        return min;
    }

    private static int countOfMin(int[] inputArray, int minDigit){
        int countOfMinDigit = 0;
        for (int i = 0; i < inputArray.length; i++){
            if (inputArray[i] == minDigit) countOfMinDigit = countOfMinDigit + 1;
        }
        return countOfMinDigit;
    }

    private static ArrayList<Integer> newArrayCreator(int []inputArray, int minDigit ) {
        ArrayList<Integer>resultArray=new ArrayList<>();
        for (int i = 0; i < inputArray.length; i++){
            if(inputArray[i]!=minDigit){
                resultArray.add(inputArray[i]);
            }
        }
        return resultArray;
    }

    private static void printData(String s, int[] array){
        System.out.print(s);
        for (int i = 0; i<array.length; i++){
            System.out.print(" " + array[i] + "; ");
        }
    }

    private static void printData(String s, ArrayList<Integer>list){
        System.out.println(s);
        System.out.println(list);
    }

    private static void printData(String s, int x){
        System.out.println();
        System.out.println(s +" "+ x +" ");

    }
}
