package com.epam.modulefive.taskthree;

import com.epam.utils.ScannerUtil;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о
 * выходных и праздничных днях.
 */

public class Calendar {
    public Calendar() {
        LocalDate localDate = LocalDate.now();
        System.out.println("Today is " + localDate);
        System.out.println(localDate.getDayOfMonth() + " "
                                                     + localDate.getMonth()
                                                     + ", "
                                                     + localDate.getDayOfWeek());
        printDayNotification();
    }


    List<NoteToDate> noteToDatesList = new ArrayList<>();

    public void createNewNote() {
        NoteToDate noteToDate = new NoteToDate();
        noteToDate.setDay(ScannerUtil.integerIn("enter the day, like 5 or 31 "));
        noteToDate.setMonth(ScannerUtil.integerIn("enter the month, like 2 or 11"));
        noteToDate.setYear(ScannerUtil.integerIn("type year, in xxxx format"));
        noteToDate.setDescriptionOfDay();
        noteToDate.setDayCategory(noteToDate.chooseCategoryOfDay());
        noteToDatesList.add(noteToDate);
    }

    private void printDayNotification(){
        LocalDate localDate = LocalDate.now();
        for (NoteToDate date: noteToDatesList) {
            if (localDate.equals(date.significalDate)) {
                System.out.println(date.descriptionOfDay);
                System.out.println(date.dayCategory);
            } else {
                System.out.println("today is an ordinary day");
            }
        }
        NoteToDate noteToDate = new NoteToDate();
        noteToDate.isWeekend();
    }

    private class NoteToDate {
        private int year;
        private int month;
        private int day;
        private String descriptionOfDay = "";
        private DayCategory dayCategory;
        LocalDate localDate = LocalDate.now();
        LocalDate significalDate = localDate;

        private void isWeekend() {
            LocalDate localDate = LocalDate.now();
            if (localDate.getDayOfWeek().equals(DayOfWeek.SATURDAY) || localDate.getDayOfWeek()
                                                                                .equals(DayOfWeek.SUNDAY)) {
                System.out.println("it is a weekend! ");
            }
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            if (year > 0) {
                this.year = year;
            } else {
                year = localDate.getYear();
            }
        }

        public int getMonth() {
            return month;
        }

        public void setMonth(int month) {
            if (month > 0 && month <= 12) {
                this.month = month;
            } else {
                month = localDate.getMonthValue();
            }
        }

        public int getDay() {
            return day;

        }

        public void setDay(int day) {
            if (day > 0 && day <= 31) {
                this.day = day;
            } else {
                day = localDate.getDayOfMonth();
            }
        }

        public String getDescriptionOfDay() {
            return descriptionOfDay;
        }

        public void setDescriptionOfDay() {
            String descriptionOfDay = ScannerUtil.stringIn("type day description");
            this.descriptionOfDay = descriptionOfDay;
        }

        public DayCategory getDayCategory() {
            return dayCategory;
        }

        public void setDayCategory(DayCategory dayCategory) {
            this.dayCategory = dayCategory;
        }

        public DayCategory chooseCategoryOfDay() {
            System.out.println("enter the code of day's category:\n" +
                    " 1 - workday; 2 - day off; 3 - holiday adn day off; 4 - holiday; 5 - event");
            DayCategory dayCategory = null;
            int i = ScannerUtil.integerIn("type category");
            switch (i) {
                case 1:
                    dayCategory = DayCategory.WORKDAY;
                    break;
                case 2:
                    dayCategory = DayCategory.DAY_OFF;
                    break;
                case 3:
                    dayCategory = DayCategory.HOLIDAY_AND_DAY_OFF;
                    break;
                case 4:
                    dayCategory = DayCategory.HOLIDAY;
                    break;
                case 5:
                    dayCategory = DayCategory.SIGNIFICANT_EVENT;
                    break;
                default:
                    dayCategory = DayCategory.WORKDAY;
                    break;
            }
            return dayCategory;
        }
    }
}
