package com.epam.modulefour.taskfifteen.enumcontainer;

public enum TransportType {
    PLANE("самолет"),
    BUS("автобус"),
    REALWAY("поезд");

    private String transportTypeTranslation;

    TransportType(String transportTypeTranslation) {
        this.transportTypeTranslation = transportTypeTranslation;
    }

    @Override
    public String toString() {
        return transportTypeTranslation;
    }
}
