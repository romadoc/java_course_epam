package com.epam.modulefour.taskfour;

import java.time.LocalTime;
import java.util.Comparator;

/**
 * Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
 * Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива
 * по номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
 * Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми
 * пунктами назначения должны быть упорядочены по времени отправления.
 */
public class Train {
    private String destination;
    private int numberOfTrain;
    private LocalTime localTime;

    public Train (int numberOfTrain, String destination, int hour, int min) {
        this.destination = destination;
        this.numberOfTrain = numberOfTrain;
        this.localTime = LocalTime.of(hour, min);
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDestination() {
        return destination;
    }

    public void setNumberOfTrain(int numberOfTrain) {
        this.numberOfTrain = numberOfTrain;
    }

    public int getNumberOfTrain() {
        return numberOfTrain;
    }

    public int getHour() {
        return localTime.getHour();
    }
    public int getMinute() {
        return  localTime.getMinute();
    }

}
