package com.epam.module1.part3_cycle;

import java.util.Scanner;

//Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
//все числа от 1 до введенного пользователем числа.

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(">>");
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.print(">>");
        }
        int x = scanner.nextInt();
        int sum = 0;
        while (x < 0) {
            scanner.nextLine();
            System.out.print(">>");
        }
        for (int i = 0; i <= x; i++) {
            sum += i;

        }

        System.out.println(sum);
    }
}
