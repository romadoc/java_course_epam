package com.epam.modulefour.taskfifteen.enumcontainer;

public enum DaysOfTravel {
    TEN("10"),
    FIFTEEN("15"),
    TWENTY("20");

    private String translationDays;

    DaysOfTravel(String translationDays) {
        this.translationDays = translationDays;
    }

    @Override
    public String toString() {
        return translationDays;
    }
}
