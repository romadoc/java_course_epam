package com.epam.moduleone.parttwobranching;

// Найти max{min(a, b), min(c, d)}
public class Main2 {
    private final static int A = 2;
    private final static int B = 1;
    private final static int C = 4;
    private final static int D = 3;
    public static void main(String[] args) {
        System.out.println(Math.max(Math.min(A, B), Math.min(C, D)));
    }

}
