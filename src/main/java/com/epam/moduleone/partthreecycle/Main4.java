package com.epam.moduleone.partthreecycle;

//Составить программу нахождения произведения квадратов первых двухсот чисел

import java.math.BigInteger;

public class Main4 {
    public static void main(String[] args) {
        BigInteger s = BigInteger.valueOf(1);
        for(int i = 2; i <= 200; i++) {
            s = s.multiply(BigInteger.valueOf((long) i * i));
        }
        System.out.println(s);
    }

}
