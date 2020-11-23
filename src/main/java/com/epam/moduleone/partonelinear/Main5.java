package com.epam.moduleone.partonelinear;

import java.util.Scanner;

public class Main5 {
    /*
    Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
данное значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type the number of seconds (in natural number form) >>");
        int seconds = scanner.nextInt();
        int hours = seconds / 3600;
        int minutes = (seconds - hours * 3600) / 60;
        int seconds1 = seconds - hours * 3600 - minutes * 60;
        StringBuilder outputDates = new StringBuilder();
        outputDates.append(hours).append("ч ").append(minutes).append("мин ").append(seconds1).append("с.");

        if (hours < 10) {
            outputDates.insert(0, "0");
        }

        System.out.println(outputDates);

    }

}
