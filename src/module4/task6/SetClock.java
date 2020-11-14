package module4.task6;

import java.util.Scanner;

public class SetClock {
    public static void main(String[] args) {
        int hours;
        int min;
        int sec;
        Clock clock = new Clock(0, 0, 0);

        hours = digitForTime("type hour 0-24");
        min = digitForTime("type min 0-60");
        sec = digitForTime("type seconds 0-60");

        clock.setHour(hours);
        clock.setMin(min);
        clock.setSec(sec);
        clock.printClock();


    }

    public static int digitForTime(String s) {
        s = s + " >>";
        System.out.print(s);
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.print(s);
            scanner.next();
        }
        int digit = scanner.nextInt();
        return digit;
    }
}
