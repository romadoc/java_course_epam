package module4.task6;

import java.time.LocalTime;

/*
Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
заданное количество часов, минут и секунд.
 */
public class Clock {
    private int hour;
    private int min;
    private int sec;


    Clock(int hour, int min, int sec) {
        LocalTime localTime = LocalTime.of(hour, min, sec);
        System.out.println("started watch:");
        System.out.println(localTime);
    }


    public void setHour(int hour) {
        if (hour >= 0 && hour <= 24) {
            this.hour = hour;
        } else {
            System.out.println("incorrect hours format!");
            this.hour = 0;
        }
    }


    public void setMin(int min) {
        if (min >= 0 && min <= 60) {
            this.min = min;
        } else {
            System.out.println("incorrect minutes format!");
            this.min = 0;
        }
    }


    public void setSec(int sec) {
        if (sec >= 0 && sec <= 60) {
            this.sec = sec;
        } else {
            System.out.println("incorrect seconds format!");
            this.sec = 0;
        }
    }

    public void printClock() {
        LocalTime localTime = LocalTime.of(this.hour, this.min, this.sec);
        System.out.println(localTime);
    }

}
