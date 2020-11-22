package com.epam.module1.part1_linear;

import java.util.Scanner;

//Задача номер 6, 1 модуль, 1 раздел. Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
//принадлежит закрашенной области, и false — в противном случае:
public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("type X coordinate: >> ");
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.print(">> ");
        }
        int x = scanner.nextInt();
        System.out.println();
        System.out.print("type Y coordinate: >> ");
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.print(">> ");
        }
        int y = scanner.nextInt();

        if (x >= -4 && x <= 4 && y >= -3 && y <= 0) // if we in big figure?
            System.out.println("true");
        else if (x >= -2 && x <= 2 && y <= 4 && y > 0) // if we are in small figure?
            System.out.println("true");
        else System.out.println("false");
    }

}
