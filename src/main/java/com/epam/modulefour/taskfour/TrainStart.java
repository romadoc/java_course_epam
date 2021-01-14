package com.epam.modulefour.taskfour;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива
 * по номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
 * Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми
 * пунктами назначения должны быть упорядочены по времени отправления.
 */
public class TrainStart {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Train>trains = new ArrayList<>();
        ArrayList<String>stringsOfTrainData = new ArrayList<>();
        



    }
    private static ArrayList<String> getTrainInfo() throws FileNotFoundException {
        String filePath = new File("src\\main\\resources\\trains.txt").getAbsolutePath();
        File trainFile = new File(filePath);
        ArrayList<String>list = new ArrayList<>();
        Scanner scanner = new Scanner(trainFile);
        while (scanner.hasNextLine()){
           list.add(scanner.nextLine());
        }

        for (String s: list) {
            System.out.println(s);
        }
        return list;
    }



}
