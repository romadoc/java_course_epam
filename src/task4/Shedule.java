package task4;

import java.util.Arrays;

public class Shedule {
    Train train = new Train("Moskow", 4, 12,10);
    Train train1 = new Train("Minsk", 2, 2, 15);
    Train train2 = new Train("Berlin", 16, 20, 20);
    Train train3 = new Train("Moskow", 3, 15, 40);
    Train train4 = new Train("Brest", 7, 4, 30);
    Train[]trains = {train, train1, train2, train3, train4};
    static final String DESTINATION = " destination: ";
    static final String NUMBER = " tr # ";
    static final String DEPARTURE = " dep time: ";

    public void simpleOut(){

        for (int i = 0; i < trains.length; i++){
            printTrain(i, trains);
        }
    }
    public void upSort() {
        System.out.println();
        System.out.println("Sorted by #:");
        for (int i = 0; i < trains.length; i++){
            for (int j = 0; j < trains.length-1;j++) {
                if (trains[j].getNumTrain() > trains[j + 1].getNumTrain()) {
                    Train trainSwap = trains[j];
                    trains[j] = trains[j+1];
                    trains[j+1] = trainSwap;
                }
            }
            printTrain(i, trains);
        }
    }

    private void printTrain(int i, Train[] trains) {
        System.out.println(DESTINATION + trains[i].getDestination() + NUMBER + trains[i].getNumTrain() +
                DEPARTURE + trains[i].getHour()+": "+trains[i].getMinute());
    }

    public void findTrain(int x){
        System.out.println();
        System.out.println("found result(by number " + x + "):");
        int foundCount = 0;
        for (int i = 0; i < trains.length; i++){

            if (x == trains[i].getNumTrain()){
                printTrain(i, trains);
                foundCount++;
            }

        }
        if (foundCount<1){
            System.out.println("no this train");
        }
    }
    public void destSort(){
        System.out.println();
        System.out.println("sorted by destination:");
        Train[]sortedTrains = trains;
        Arrays.sort(sortedTrains, Train.TrainDestComporator);
        for (int i = 0; i < sortedTrains.length; i++){
            printTrain(i, sortedTrains);

        }

    }
}
