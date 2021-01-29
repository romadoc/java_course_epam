package com.epam.modulefour.taskfifteen.enumcontainer;

public enum Country {
    GERMANY("Герамания"),
    ITALY("Италия"),
    ANTALIA("Анталия"),
    SWEDEN("Швеция"),
    INDIA("Индия"),
    CHINA("Китай"),
    GREECE("Греция"),
    CUBA("Куба");

    private String countryTranslation;
    Country(String countryTranslation) {
        this.countryTranslation = countryTranslation;
    }
    public String getFeedtypeTranslation() {
        return countryTranslation;
    }

    @Override
    public String toString() {
        return countryTranslation;
    }

}
