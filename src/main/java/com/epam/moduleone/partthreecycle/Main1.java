package com.epam.moduleone.partthreecycle;

import utils.ScannerUtil;

//Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
//все числа от 1 до введенного пользователем числа.

public class Main1 {
    private final static String WARNING = "this digit is out of Integer range!";
    public static void main(String[] args) {

        long x = ScannerUtil.longIn("Type any digit (integer, less then 2147483647)");
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
