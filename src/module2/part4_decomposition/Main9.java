package module2.part4_decomposition;

import java.util.Scanner;

/*
 Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
если угол между сторонами длиной X и Y— прямой.
 */
public class Main9 {
    public static void main(String[] args) {
        int x;
        int y;
        int z;
        int t;
        x = sideInput("type X:>");
        y = sideInput("type Y:>");
        z = sideInput("type Z:>");
        t = sideInput("type K:>");
        printAnswer(squareCounter(x, y, z, t));

    }
    private static int sideInput(String s){
        System.out.print(s);
        int x = 0;
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()){
            scanner.next();
            System.out.print(s);
        }
        x = scanner.nextInt();
        return x;
    }
    private static double squareCounter(int x, int z, int y, int t){

        double diaqonal;
        diaqonal = Math.sqrt((x * x) + (y * y));
        double square1 = (x * y) / 2.0;
        double pSemiPerimetr = (diaqonal + z + t)/2.0;
        double square2 = Math.sqrt((pSemiPerimetr - z)*(pSemiPerimetr - diaqonal)*(pSemiPerimetr - t));
        square1 = square1 + square2;

        return square1;
    }
    private static void printAnswer(double square){
        System.out.println();
        System.out.println("square is " + square);
    }
}
