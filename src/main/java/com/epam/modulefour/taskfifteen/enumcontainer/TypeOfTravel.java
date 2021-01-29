package com.epam.modulefour.taskfifteen.enumcontainer;

public enum TypeOfTravel {
    REST("отдых"),
    EXCURTIONS("экскурсионный"),
    TREATMENT("лечение"),
    SHOPPING("шоппинг тур"),
    CRUISE("круизное путешествие");

    private String typeTranslation;
    TypeOfTravel(String typeTranslation) {
        this.typeTranslation = typeTranslation;
    }

    @Override
    public String toString() {
        return typeTranslation;
    }
}
