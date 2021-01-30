package com.epam.moduletwo.decomposition;

/**
 * На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
 * из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
 * task 4 : https://learn.epam.com/myLearning/program?groupGuid=df7fb55b-0efc-452b-9509-aa8160990adb
 */
public class Main4 {
    public static void main(String[] args) {
        int[] pointA = coordinate();
        int[] pointB = coordinate();
        int[] pointC = coordinate();

        printPointsCoordinate(pointA, "A");
        printPointsCoordinate(pointB, "B");
        printPointsCoordinate(pointC, "C");

        System.out.println();
        comparer(pointA, pointB, pointC);

    }

    private static int[] coordinate() {

        int[] array = new int[2];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        return array;
    }

    private static int countDistance(int[] point1, int[] point2) {
        int dist = (int) Math.sqrt(Math.pow((point1[0] - point2[0]), 2) + Math.pow((point1[1] - point2[1]), 2));
        return dist;
    }

    private static void comparer(int[] a, int[] b, int[] c) {
        int[] arrOfDist = new int[3];
        arrOfDist[0] = countDistance(a, b);
        arrOfDist[1] = countDistance(b, c);
        arrOfDist[2] = countDistance(c, a);
        int maxLine = arrOfDist[0];
        String s = " ";
        for (int i = 0; i < arrOfDist.length; i++) {
            if (maxLine < arrOfDist[i]) {
                maxLine = arrOfDist[i];
                if (maxLine == arrOfDist[0]) {
                    s = "A-B";
                }
                if (maxLine == arrOfDist[1]) {
                    s = " B-C";
                }
                if (maxLine == arrOfDist[2]) {
                    s = "C-A";
                }
            }
            System.out.print(arrOfDist[i] + "; ");
        }
        System.out.println();
        System.out.println("max distanse is " + maxLine + " " + s);
    }

    private static void printPointsCoordinate(int[] coordinate, String s) {
        System.out.println();
        System.out.print(s + "(x, y): ");
        for (int point : coordinate) {
            System.out.print(point + "; ");
        }
    }

}
