package com.epam.moduletwo.decomposition;

/**
 * Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 * task 7 : https://learn.epam.com/myLearning/program?groupGuid=df7fb55b-0efc-452b-9509-aa8160990adb
 */
public class Main7 {
    public static void main(String[] args) {
        int[]array = startArrayConstructor();
        getSumOfFactorial(array, "Factorial's sum (1...9): ");
    }

    private static int[] startArrayConstructor() {
        int[] array = new int[9];
        for (int i = 0; i < array.length; i ++) {
            array[i] = i+1;
        }
        return array;
    }

    private static int countFactorial(int a) {
        int rezult = 1;
        for(int i = 1; i < a; i++) {
            rezult = rezult * i;
        }
        return rezult;

    }private static void getSumOfFactorial(int[] arrayIn, String s) {
        int sum = 0;
        for (int i = 0; i < arrayIn.length; i++) {
            if(arrayIn[i]%2 > 0) {
                sum = sum + countFactorial(arrayIn[i]);
            }
        }
        System.out.print(s + sum);
    }
}
