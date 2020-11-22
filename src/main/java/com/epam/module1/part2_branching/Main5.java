package com.epam.module1.part2_branching;

// вычислить значение функции x digr2 - 3x + 9 при x <= 3;
// 1/x digr3 + 6 if x > 3;
// вариант решения с использованием цикла
public class Main5 {

    public static void main(String[] args) {
        double x = 3;
        double y;
        double z = 4;

        while (x <= 3 && x >= -6) {
            y = Math.pow(x, 2) - 3 * x + 9;
            x--;
            System.out.print(" x = " + x + " " + " y = " + y + "; ");

        }

        System.out.println();

        while (z > 3 && z < 14) {
            y = 1 / Math.pow(z, 3) + 6;
            z++;
            System.out.print(" x = " + z + " " + " y = " + y + ";");

        }


    }
}
