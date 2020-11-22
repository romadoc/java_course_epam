package com.epam.module1.part2_branching;

import java.util.Scanner;

public class Main1 {
    //  Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
    //  он прямоугольным.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("angle one? >>");
        while (!scanner.hasNextFloat()) {
            scanner.nextLine();
            System.out.println();
            System.out.print("angle one? >>");
        }
        float angleX = scanner.nextFloat();

        System.out.print("angle two? >>");
        while (!scanner.hasNextFloat()) {
            scanner.nextLine();
            System.out.println();
            System.out.print("angle one? >>");
        }
        float angleY = scanner.nextFloat();

        if (angleX >= 90 && angleY >= 90) {
            System.out.println("it's not a triangle!");
        }
        if (angleX == 0 || angleY == 0) {
            System.out.println("it's not a triangle!");
        }
        if (angleX == 90 && angleY < 90 && angleY != 0 || angleX < 90 && angleX != 0 && angleY == 90) {
            System.out.println("the triangle exists! it's right angle triangle");
        }
        if (angleX < 90 && angleX != 0 && angleY < 90 && angleY != 0) {
            System.out.println("the triangle exists!");
        }


    }
}
