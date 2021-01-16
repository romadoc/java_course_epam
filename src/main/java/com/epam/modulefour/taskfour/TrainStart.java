package com.epam.modulefour.taskfour;

import com.epam.utils.ScannerUtil;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TrainStart {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Train>trains = new ArrayList<>();
        ArrayList<String>stringsOfTrainData = loadTrainInfoFromFileToList();

        for (int i = 0; i < 5; i++){
            Train train = new Train(getTrainNumer(makeArrayFromString(stringsOfTrainData.get(i))),
                                    getDestination(makeArrayFromString(stringsOfTrainData.get(i))),
                                    getHour(makeArrayFromString(stringsOfTrainData.get(i))),
                                    getMinute(makeArrayFromString(stringsOfTrainData.get(i)))
                                    );
            trains.add(train);
        }
        TrainSorter trainSorter = new TrainSorter(trains);
        trainSorter.print();
        trainSorter.sortByNumberUpToLow();
        trainSorter.print();
        trainSorter.sortByNumberLowToLarge();
        trainSorter.print();
        trainSorter.sortByDestination();
        trainSorter.print();
        System.out.println();
        trainSorter.getInfoOfChoosenTrainByNumber(ScannerUtil.integerIn("enter train number"));




    }

     static ArrayList<String> loadTrainInfoFromFileToList() throws FileNotFoundException {
        String filePath = new File("src\\main\\resources\\trains.txt").getAbsolutePath();
        File trainFile = new File(filePath);
        ArrayList<String>list = new ArrayList<>();
        Scanner scanner = new Scanner(trainFile);
        while (scanner.hasNextLine()){
           list.add(scanner.nextLine());
        }
        return list;
    }

    static String[] makeArrayFromString(String stringIn){
        stringIn = stringIn.trim();
        stringIn = stringIn.replaceAll("\\s+","");
        String[] strings = stringIn.split(",");
        return strings;
    }

    static int getTrainNumer(String[]strings){
        int trainNumber = Integer.parseInt(strings[0]);
        return trainNumber;
    }

    static String getDestination(String[] strings){
        String destination = strings[1];
        return destination;
    }
    static int getHour(String[]strings){
        int hour = Integer.parseInt(strings[2]);
        return hour;
    }
    static int getMinute(String[]strings){
        int hour = Integer.parseInt(strings[3]);
        return hour;
    }

}
