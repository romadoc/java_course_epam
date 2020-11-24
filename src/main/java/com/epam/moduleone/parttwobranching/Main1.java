package com.epam.moduleone.parttwobranching;

import java.util.Scanner;

public class Main1 {
    //  Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
    //  он прямоугольным.

    public static void main(String[] args) {
        float angleX;
        float angleY;
        angleX = angleEnter("enter the first angle (in degrees)");
        angleY = angleEnter("enter the second angle (in degrees)");
        chackingMethod(angleX, angleY);

    }
    private static float angleEnter(String s){
        System.out.print(s + " >>");
        float angle;
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextFloat()) {
            scanner.nextLine();

        }
        angle = scanner.nextFloat();
        return angle;
    }
    private static void chackingMethod(float x, float y){
        float z = 180 - (x+y);
        if(z <= 0){
            System.out.println("triangle is not exist.");
        }
        else if(z == 90.0 || x == 90.0 || y == 90.0){
            System.out.println("triangle exists. it is right triangle");
        }
        else System.out.println("triangle exists.");

    }
}
