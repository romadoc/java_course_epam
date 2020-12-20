package com.epam.moduletwo.decomposition;

import java.util.ArrayList;
import java.util.List;

/**
 * Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
 * действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
 * task 17 : https://learn.epam.com/myLearning/program?groupGuid=df7fb55b-0efc-452b-9509-aa8160990adb
 */
public class Main17 {
    public static void main(String[] args) {
        int n;
        n = (int)(Math.random()*5000);
        List<Integer>list = startDisintegrator(n);
        int sum = startSummator(list);

        System.out.println("start digit: " + n);
        System.out.println("digits: " + list);
        System.out.println("sum of digits: " + sum);
        System.out.println("*****************************");
        System.out.println("results: ");
        getSolution(n);
    }

    private static List<Integer> startDisintegrator(int x){
        List<Integer> list = new ArrayList<>();
        while (x != 0) {
            list.add(x % 10);
            x /= 10;

        }
        return list;
    }

    private static int startSummator(List<Integer> list){
        int sum = 0;
        for (int i = 0; i < list.size(); i++){
            sum = list.get(i) + sum;
        }
        return sum;
    }

     private static void getSolution(int digitIn){
        int counter = 0;
        System.out.print(digitIn + "; ");
        int a = digitIn;

        while (a !=0){
            a = a - startSummator(startDisintegrator(a));
            System.out.print(a +"; ");
            counter++;
        }

        System.out.println();
        System.out.println("interations: " + counter);
    }
}
