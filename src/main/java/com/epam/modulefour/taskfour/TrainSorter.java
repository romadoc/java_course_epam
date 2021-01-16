package com.epam.modulefour.taskfour;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TrainSorter {
    ArrayList<Train>trains;
    public TrainSorter(ArrayList<Train>trains) {
        this.trains = trains;
    }

    public void sortByNumberUpToLow(){
        System.out.println();
        System.out.println("Sorted by number (from higher number to lower number):");
        Collections.sort(trains, new Comparator<Train>() {
            @Override
            public int compare(Train train1, Train train2) {
                String dest = train1.getDestination();
                String dest1 = train2.getDestination();
                int trainNumber1 = train1.getNumberOfTrain();
                int trainNumber2 = train2.getNumberOfTrain();
                if (trainNumber1>trainNumber2){
                    return -1;
                }
                if (trainNumber1<trainNumber2){
                    return 1;
                }
                return dest.compareTo(dest1);
            }
        });
    }

    public void sortByNumberLowToLarge(){
        System.out.println();
        System.out.println("Sorted by number (from lower number to higher number):");
        Collections.sort(trains, new Comparator<Train>() {
            @Override
            public int compare(Train train1, Train train2) {
                String dest = train1.getDestination();
                String dest1 = train2.getDestination();
                int trainNumber1 = train1.getNumberOfTrain();
                int trainNumber2 = train2.getNumberOfTrain();
                if (trainNumber1>trainNumber2){
                    return 1;
                }
                if (trainNumber1<trainNumber2){
                    return -1;
                }
                return dest.compareTo(dest1);
            }
        });
    }

    public void sortByDestination(){
        System.out.println();
        System.out.println("Sorted by destination:");
        Collections.sort(trains, new Comparator<Train>() {
            @Override
            public int compare(Train train1, Train train2) {
                return train1.getDestination().compareTo(train2.getDestination());
            }
        });
    }

    public void getInfoOfChoosenTrainByNumber(int trainNumber){
        System.out.println();
        System.out.println("found result (by number " + trainNumber + "):");
        int foundCount = 0;
        for (int i = 0; i < trains.size(); i++){

            if (trainNumber == trains.get(i).getNumberOfTrain()){
                System.out.println("number: " + trains.get(i).getNumberOfTrain() + " destination: " +
                                   trains.get(i).getDestination() + " " +
                                   trains.get(i).getHour() + "hh " +
                                   trains.get(i).getMinute() + "mm");
                foundCount++;
            }

        }
        if (foundCount<1){
            System.out.println("no this train");
        }

    }


    public void print(){
        for (Train s: trains ) {
            System.out.println("number: "+ s.getNumberOfTrain() + " destination: " +
                                           s.getDestination() + " " +
                                           s.getHour() + "hh " +
                                           s.getMinute()+"mm");
        }
    }
}
