package com.epam.modulefour.taskten;

import java.time.LocalTime;

/**
    Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
    и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
    методами. Задать критерии выбора данных и вывести эти данные на консоль.
    Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
    Найти и вывести:
    a) список рейсов для заданного пункта назначения;
    b) список рейсов для заданного дня недели;
    c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
*/

public class Airline {
    private String destination;
    private int flightNumber;
    private String aircraftType;
    private LocalTime departureTime;
    private DayOfWeek dayOfWeek;

    public Airline(String destination, int flightNumber, String aircraftType,
                   int hour, int minute, DayOfWeek dayOfWeek) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.aircraftType = aircraftType;
        this.departureTime = LocalTime.of(hour, minute);
        this.dayOfWeek = dayOfWeek;
    }

    @Override
    public String toString() {
        return  "\n flight: " + flightNumber + "; destination: " + destination +
                ", type of airplan: " + aircraftType + ", departure " + departureTime +
                ", day of week: " + dayOfWeek;
    }

    public String getDestination() {
        return destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }
}
