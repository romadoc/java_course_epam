package com.epam.moduletwo.arrayssimple;
//В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
//чисел несколько, то определить наименьшее из них.
public class Main9 {
    public static void main(String[] args) {
        int[] generatedArray = arrayConstruct();
        printData("generated array: ", generatedArray);
        digitCount(generatedArray);

    }

    private static int[] arrayConstruct() {
        int n;
        n = (int) (Math.random() * 20);

        int[] madeArray = new int[n];
        for (int i = 0; i < madeArray.length; i++) {
            madeArray[i] = (int) (Math.random() * 10);
        }
        return madeArray;
    }

    private static void printData(String s, int[] printedArray) {
        System.out.println();
        System.out.print(" " + s + " ");

        for (int i = 0; i < printedArray.length; i++) {
            System.out.print(" " + printedArray[i] + "; ");
        }
        System.out.println();
    }

    private static void digitCount(int[] array) {
        int frquencyOfdigit;
        frquencyOfdigit = 0;

        int[] digits = new int[array.length];
        for (int i = 0; i < array.length; i++){

            int elem;
            elem = array[i];

            int counter;
            counter = 0;

            for ( int j = 0; j < array.length; j++){
                if (array[j] == elem){
                    counter++;
                }
            }
            digits[i] = counter;
            if (counter > frquencyOfdigit){
                frquencyOfdigit = counter;
            }
            System.out.print(digits[i] + "; ");

        }
        System.out.println();
        int rezult = Integer.MAX_VALUE;
        for (int i = 0; i < digits.length; i++){
            if(digits[i] == frquencyOfdigit && array[i] < rezult){
                rezult = array[i];
            }
        }
        System.out.println("the greatest digit is " + rezult);

    }
}
