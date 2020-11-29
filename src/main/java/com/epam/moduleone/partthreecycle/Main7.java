package com.epam.moduleone.partthreecycle;

import validator.Validator;

import java.util.Scanner;

//Для каждого натурального числа в промежутке от
// m до n вывести все делители, кроме единицы и самого числа. m и n вводятся с клавиатуры

public class Main7 {
    public static void main(String[] args) {
        int m = Validator.intIn("type m");
        int n = Validator.intIn("type n");
        rezultOut(m, n);

    }

    public static void rezultOut(int m, int n) {
        String rez;
        while (m <= n) {
            System.out.print("число: " + m + " , делители - ");

            for (int i = 2; i < m - 1; i++) {

                if ((m % i) == 0) {
                    rez = (" " + i + "; ");
                    System.out.print(rez);

                }

            }
            System.out.println();
            m++;
        }

    }

}
