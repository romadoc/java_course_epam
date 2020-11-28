package com.epam.moduleone.partthreecycle;

//вычислить значения функции y = x, x > 2; y = -x, x <=2, с шагом h(шаг принимаем за 1)
public class Main2 {
    public static void main(String[] args) {


        int y;

        System.out.println("значения функции при y = x, x > 2:");
        for (int i = 3; i < 8; i++) {
            y = i;
            System.out.print(" x = " + i + " y = " + y + ";");
        }
        System.out.println();
        System.out.println("значения функции при y = -x, x<=2:");
        for (int i = -2; i <= 2; i++) {
            y = -i;
            System.out.print(" x = " + i + " y = " + y + ";");

        }
    }
}
