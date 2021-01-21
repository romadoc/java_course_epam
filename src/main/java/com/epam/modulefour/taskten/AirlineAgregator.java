package com.epam.modulefour.taskten;

import com.epam.utils.ScannerUtil;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class AirlineAgregator {

    public static void main(String[] args) {
        List<Airline>airplanes = new ArrayList<>();
        airplanes.add(new Airline("Amsterdam", 2, "cargo",
                             13,15, DayOfWeek.MONDAY ));
        airplanes.add(new Airline("Amsterdam", 4,"private",
                             20, 30, DayOfWeek.SATURDAY));
        airplanes.add(new Airline("Moscow", 77,"passenger",
                             10, 45, DayOfWeek.THURSDAY));
        airplanes.add(new Airline("London", 564,"passenger",
                             12, 20, DayOfWeek.TUESDAY));
        airplanes.add(new Airline("Minsk", 441,"cargo",
                             21, 0, DayOfWeek.FRIDAY));
        airplanes.add(new Airline("Minsk", 23,"passenger",
                             5, 30, DayOfWeek.WEDNESDAY));
        airplanes.add(new Airline("Minsk", 323,"passenger",
                             18, 50, DayOfWeek.SUNDAY));
        airplanes.add(new Airline("Monako", 5711,"passenger",
                             19, 17, DayOfWeek.FRIDAY));
        airplanes.add(new Airline("Berlin", 441,"cargo",
                             22, 50, DayOfWeek.FRIDAY));

        System.out.println(airplanes);
        getPlanesByDestination(airplanes, ScannerUtil.stringIn("type destination"));
        getPlanesByDayOfWeek(airplanes, ScannerUtil.stringIn("type destination day of week"));
        getPlanesByDayTime(airplanes, ScannerUtil.stringIn("type destination day of week"));
    }

    private static void getPlanesByDestination(List<Airline>airplanes, String destination){
        for (Airline airline: airplanes ) {
            if(airline.getDestination().equalsIgnoreCase(destination)){
                System.out.println(airline);
            }
        }
    }

    private static void getPlanesByDayOfWeek(List<Airline>airplanes, String dayOfWeek){
        for (Airline airline: airplanes){
            if(airline.getDayOfWeek().toString().equalsIgnoreCase(dayOfWeek)){
                System.out.println(airline);
            }
        }
    }

    private static void getPlanesByDayTime(List<Airline>airplanes, String dayOfWeek){
        int hour = ScannerUtil.integerIn("type dep. hour");
        int minute = ScannerUtil.integerIn("type dep. min");
        LocalTime time = LocalTime.of(hour,minute);
        for (Airline airline: airplanes) {
            if (airline.getDayOfWeek().toString().equalsIgnoreCase(dayOfWeek)&&
                    airline.getDepartureTime().isAfter(time)) {

                System.out.println(airline);

            }
        }
    }
}
