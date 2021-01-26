package com.epam.modulefour.taskthirteenth;

public class City {
    private int idCity;
    private String cityName;
    private boolean isCapital;
    private int idDistrict;
    private boolean isRegionCenter;

    public City(int idCity, String cityName, boolean isCapital, boolean isRegionCenter, int idDistrict) {
        this.idCity = idCity;
        this.cityName = cityName;
        this.isCapital = isCapital;
        this.isRegionCenter = isRegionCenter;
        this.idDistrict = idDistrict;
    }

    public String getCityName() {
        return cityName;
    }

    public boolean isCapital() {
        return isCapital;
    }

    public int getIdDistrict() {
        return idDistrict;
    }

    public boolean isRegionCenter() {
        return isRegionCenter;
    }

    @Override
    public String toString() {
        return cityName;
    }
}
