package com.epam.moduletwo.arrayssimple;
import java.util.ArrayList;
import java.util.Collections;

//В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
//чисел несколько, то определить наименьшее из них.
public class Main9 {
    public static void main(String[] args) {
        int[] generatedArray = createArray();
        printData("generated array: ", generatedArray);
        getAnswer(generatedArray);
    }

    private static int[] createArray() {
        int n;
        n = (int) (Math.random() * 20);
        int[] createdArray = new int[n];
        for (int i = 0; i < createdArray.length; i++) {
            createdArray[i] = (int) (Math.random() * 20-10);
        }
        return createdArray;
    }

    private static void printData(String s, int[] arrayIn) {
        System.out.println(s);

        for (int i = 0; i < arrayIn.length; i++) {
            System.out.print(" " + arrayIn[i] + "; ");
        }
        System.out.println();
    }

    private static void getAnswer(int[] array) {
        int theMostCommonNumber = 0;
        int[] arrayOfAnyElemFrequency = new int[array.length];
        ArrayList<Integer>arrayFoundNumbers = new ArrayList<>();
        int foundDigitOfAnswer;

        for (int i = 0; i < array.length; i++) {
            int checkedElementOfOriginalArray = array[i];
            int counter = 0;

            for ( int j = i; j < array.length; j++) {
                if (array[j] == checkedElementOfOriginalArray) {
                    counter++;
                }
            }

            arrayOfAnyElemFrequency[i] = counter;
            if (counter >= theMostCommonNumber && arrayOfAnyElemFrequency[i] == counter) {
                theMostCommonNumber = counter;
                arrayFoundNumbers.add(array[i]);
            }
        }
        foundDigitOfAnswer = Collections.min(arrayFoundNumbers);
        System.out.println();
        System.out.println("most common and min number is " + foundDigitOfAnswer);
    }
}