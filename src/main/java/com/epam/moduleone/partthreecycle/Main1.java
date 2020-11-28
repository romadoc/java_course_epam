package com.epam.moduleone.partthreecycle;

import java.util.Scanner;

//Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
//все числа от 1 до введенного пользователем числа.

public class Main1 {
    private final static String WARNING = "this digit is out of Integer range!";
    public static void main(String[] args) {

        String s = "Type any digit (integer, less then 2147483647) >>";
        Scanner scanner = new Scanner(System.in);
        System.out.print(s);
        while (!scanner.hasNextLong()) {
            scanner.nextLine();
            System.out.print(s);
        }
        long x = scanner.nextLong();
        long sum = 0;
        if(x < Integer.MAX_VALUE && x > 0){
              for (int i = 1; i < x; i++) {
                sum += i;
            }
            System.out.println(sum);
        }else {
            System.out.println(WARNING);
        }


    }
}
