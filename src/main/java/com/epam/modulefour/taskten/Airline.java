package com.epam.modulefour.taskten;

import java.time.LocalDateTime;
import java.time.LocalTime;

/*
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
    private String typeAirplan;
    private LocalTime departureTime;
    private LocalDateTime localDateTime;

    public Airline(String destination, int flightNumber, String typeAirplan, int hour, int min){
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.typeAirplan = typeAirplan;
        this.departureTime = LocalTime.of(hour, min);

        
    }

    @Override
    public String toString() {
        return "Airline{" +
                "destination='" + destination + '\'' +
                ", flightNumber=" + flightNumber +
                ", typeAirplan='" + typeAirplan + '\'' +
                ", departureTime=" + departureTime +
                ", localDateTime=" + localDateTime +
                '}';
    }

    public String getDestination() {
        return destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public String getTypeAirplan() {
        return typeAirplan;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setTypeAirplan(String typeAirplan) {
        this.typeAirplan = typeAirplan;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
}
