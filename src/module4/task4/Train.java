package module4.task4;

import java.time.LocalTime;
import java.util.Comparator;


/*
Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
Добавьте возможность сортировки массива по пункту назначения, причем поезда с одинаковыми пунктами
назначения должны быть упорядочены по времени отправления.
 */
public class Train {
    private String destination;
    private int numTrain;
    private LocalTime localTime;

    public Train (String destination, int numTran, int hour, int min){
        this.destination = destination;
        this.numTrain = numTran;
        this.localTime = LocalTime.of(hour, min);
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDestination() {
        return destination;
    }

    public void setNumTrain(int numTrain) {
        this.numTrain = numTrain;
    }

    public int getNumTrain() {
        return numTrain;
    }



    public int getHour() {
        return localTime.getHour();
    }
    public int getMinute() {
        return  localTime.getMinute();
    }

    public static Comparator<Train>TrainDestComporator = new Comparator<Train>() {
        @Override
        public int compare(Train train1, Train train2) {
            String destin1 = train1.getDestination().toLowerCase();
            int departHours1 = train1.getHour();
            String destin2 = train2.getDestination().toLowerCase();
            int departHours2 = train2.getHour();
            if(departHours1 < departHours2){
                return -1;
            }
            if(departHours2 > departHours1){
                return 1;
            }
            return destin1.compareTo(destin2);
        }
    };

}
