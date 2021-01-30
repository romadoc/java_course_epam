package com.epam.moduletwo.decomposition;

/**
 * Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
 * треугольника
 * task 3:  https://learn.epam.com/myLearning/program?groupGuid=df7fb55b-0efc-452b-9509-aa8160990adb
 */
public class Main3 {
    public static void main(String[] args) {
        int a = 10;
        printResult(countHexagonSquare(countTriangleSquare(a)), "hexagon square");
    }

    private static int countTriangleSquare(int a) {
        return (int)((a*a)*Math.sqrt(a)/4);
    }

    private static int countHexagonSquare(int x) {
        int hexagonSquare;
        hexagonSquare = x * 6;
        return hexagonSquare;
    }
    private static void printResult(int x, String s){
        System.out.print(s + ": " + x);
    }
}
