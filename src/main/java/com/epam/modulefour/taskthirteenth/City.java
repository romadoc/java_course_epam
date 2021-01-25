package com.epam.modulefour.taskthirteenth;

public class City {
    private int idCity;
    private String cityName;
    private boolean isCapital;
    private int upLevelKey;
    private boolean isRegionCenter;

    public City(int idCity, String cityName, boolean isCapital, boolean isRegionCenter, int upLevelKey) {
        this.idCity = idCity;
        this.cityName = cityName;
        this.isCapital = isCapital;
        this.isRegionCenter = isRegionCenter;
        this.upLevelKey = upLevelKey;
    }

    public int getIdCity() {
        return idCity;
    }

    public void setIdCity(int idCity) {
        this.idCity = idCity;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public boolean isCapital() {
        return isCapital;
    }

    public void setCapital(boolean capital) {
        isCapital = capital;
    }

    public int getUpLevelKey() {
        return upLevelKey;
    }

    public void setUpLevelKey(int upLevelKey) {
        this.upLevelKey = upLevelKey;
    }

    public boolean isRegionCenter() {
        return isRegionCenter;
    }

    public void setRegionCenter(boolean regionCenter) {
        isRegionCenter = regionCenter;
    }

    @Override
    public String toString() {
        return cityName;
    }
}
