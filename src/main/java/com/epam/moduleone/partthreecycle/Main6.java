package com.epam.moduleone.partthreecycle;

//Вывести на экран соответствия между символами и их численными обозначениями в памяти компьютера
public class Main6 {
    public static void main(String[] args) {

        for (int i = 0; i <= 255; i++) {
            System.out.println("символ - " + (char) i + " числовое обозначение - " + i);
        }
    }

}
