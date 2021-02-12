package com.epam.modulefour.tasksix;

import com.epam.utils.ScannerUtil;

public class SetClock {
    public static void main(String[] args) {
        int hours;
        int min;
        int sec;
        Clock clock = new Clock(0, 0, 0);

        hours = ScannerUtil.integerIn("type hour 0-24");
        min = ScannerUtil.integerIn("type min 0-60");
        sec = ScannerUtil.integerIn("type seconds 0-60");

        clock.setHour(hours);
        clock.setMin(min);
        clock.setSec(sec);
        clock.printClock();
    }

}
