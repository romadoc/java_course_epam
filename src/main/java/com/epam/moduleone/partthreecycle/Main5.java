package com.epam.moduleone.partthreecycle;

//Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда,
//модуль которых больше или равен заданному е. Общий член ряда имеет вид a = 1/2(степени n)+1/3(степени n)

import validator.Validator;

public class Main5 {

    public static void main(String[] args) {

        float e = Validator.floatIn("type float ");
        float a;
        float sum;
        sum = 0;
        for (int i = 0; ; i++) {
            a = (float) ((1 / Math.pow(2, i)) + (1 / Math.pow(3, i)));
               if (Math.abs(a) >= e) {
                sum = Math.abs(a) + sum;

            }
               else {
                   break;
               }

        }
        System.out.println("сумма модулей чисел >= "+e+": "+sum);

    }

}
