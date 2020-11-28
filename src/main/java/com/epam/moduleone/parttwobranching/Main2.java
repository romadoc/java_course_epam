package com.epam.moduleone.parttwobranching;

// Найти max{min(a, b), min(c, d)}
public class Main2 {
    public static void main(String[] args) {
        int a = 2;
        int b = 1;
        int c = 4;
        int d = 3;
        System.out.println(Math.max(Math.min(a, b), Math.min(c, d)));
    }

}
