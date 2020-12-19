package com.epam.moduletwo.arrayssimple;

import com.epam.moduletwo.utils.ScannerUtil;

//Дана последовательность действительных чисел а1 ,а2 ,..., ап.
// Заменить все ее члены, большие данного Z, этим числом. Подсчи­тать количество замен.

public class Main2 {
        static int countOfChanges = 0;
    public static void main(String[] args) {
    arrayGeneratorAndAnswerIniciation();
    }
    private static void arrayGeneratorAndAnswerIniciation(){
        float[]array = new float[20];
        System.out.println("generated array: ");
        for (int i = 0; i < array.length; i++){
            array[i] = (float) (Math.random()*200 - 100);
            System.out.print(" " + array[i] + "; ");
        }
        System.out.println();
        answerGeneration(array, ScannerUtil.floatIn("Type real number (range: -100 up to +100)"));
    }
    private static void answerGeneration(float[]array, float a){
        System.out.println("output array: ");
        for (int i = 0; i < array.length; i ++){
            if (array[i] > a) {
                array[i] = a;
                countOfChanges = countOfChanges + 1;
            }
            System.out.print(" " + array[i] + "; ");
        }
        System.out.println();
        System.out.print("count of changed elements: " + countOfChanges);
    }
}
