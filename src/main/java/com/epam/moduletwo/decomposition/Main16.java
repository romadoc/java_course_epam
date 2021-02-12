package com.epam.moduletwo.decomposition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
 * Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
 * task 16 : https://learn.epam.com/myLearning/program?groupGuid=df7fb55b-0efc-452b-9509-aa8160990adb
 */
public class Main16 {
    public static void main(String[] args) {
        int[]array = createArray();
        printArray(array, "start array");
        List<Integer>list = makeListOfUnevens(array);
        int sum = sumUnevenDigits(list);
        System.out.println("Answer 1: " + sum);
        findEvens(sum);
    }

    private static int[] createArray(){
        int[]array  = new int[20];
        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*5000);
        }
        return array;
    }

    private static void printArray(int[]arrayIn, String s){
        System.out.print(s + ": ");
        for (int elem: arrayIn) {
            System.out.print(elem + "; ");
        }
    }

    private static List<Integer> makeListOfUnevens(int[]arrayIn){
        List<Integer>list = new ArrayList<>();
        for (int i = 0; i < arrayIn.length; i++ ){
            List<Integer> subList = createArray(arrayIn[i]);
            int count = 0;
            int sum = 0;
            for(int j = 0; j < subList.size(); j++ ){

                if (subList.get(j) % 2 > 0){
                    count++;
                    sum = subList.get(j) + sum;
                    if(count == subList.size()){
                        list.add(sum);
                    }
                }
            }
        }
        System.out.println();
        System.out.print("list of sums of uneven digits: ");
        System.out.println(list);
        return list;
    }

    private static List<Integer> createArray(int x) {

        List<Integer> list = new ArrayList<>();
        while (x != 0) {
            list.add(x % 10);
            x /= 10;

        }
        Collections.reverse(list);
        return list;
    }

    private static int sumUnevenDigits(List<Integer>listIn){
        int sum = 0;
        for (int i = 0; i < listIn.size(); i++){
            sum = listIn.get(i) + sum;
        }
        return sum;
    }

    private static void findEvens(int sum){
        int x = sum;
        int count = 0;
        List<Integer> list = new ArrayList<>();
        while (x != 0) {
            list.add(x % 10);
            x /= 10;
        }
        for (int i = 0; i < list.size(); i++){
            if(list.get(i)%2 == 0){
                count++;
            }
        }
        System.out.println("Answer 2 (quantity of evens): " + count);
    }
}
