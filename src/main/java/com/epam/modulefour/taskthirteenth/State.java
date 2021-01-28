package com.epam.modulefour.taskthirteenth;

import java.util.List;

/**
 * Создать объект класса Государство, используя классы Область, Район, Город.
 * Методы вывести на консоль
 * столицу,
 * количество областей,
 * площадь,
 * областные центры.
 */
public class State {
    private int idState;
    private String stateName;
    private String capital;
    private List<City>cityList;
    private List<District>districtList;
    private List<Region>regionList;

    public State (int idState, String stateName, List<City>cityList, List<District>districtList,
                  List<Region>regionList)                                                          {
        this.idState = idState;
        this.stateName = stateName;
        this.cityList = cityList;
        this.districtList = districtList;
        this.regionList = regionList;
    }

    public String getCapital() {
        for (City s: cityList) {
            if (s.isCapital()) {
                capital = s.getCityName();
            }
        }
        return capital;
    }

    public String getStateName() {
        return stateName;
    }

    public double getSquare() {
        double square = 0;
        for (int i = 0; i < regionList.size(); i++) {
            square = square + regionList.get(i).getRegionSquare(districtList);
        }
        return square;
    }

    private int getQuantityOfRegions() {
        return regionList.size();
    }

    private void getRegionalCenters() {
        System.out.println("Regional centers: ");
        int districtIdKey = 0;
        for (City city : cityList) {
            if (city.isRegionCenter()) {
                System.out.println(city);
                districtIdKey = city.getIdDistrict();
                getDistinctCities(districtIdKey);
            }
        }

    }

    private void getDistinctCities(int i) {

        for (City s: cityList) {

            if(s.getIdDistrict() == i) {
                System.out.println("    " + s.getCityName() + ", ");
            }
        }


    }

    public void printStateInfo() {
        System.out.println("State: " + getStateName());
        System.out.println("Capital: " + getCapital());
        System.out.println("Quantity of regions: " + getQuantityOfRegions());
        System.out.println("Square: " + getSquare() + " sq. miles");
        getRegionalCenters();
    }

    public int getIdState() {
        return idState;
    }
}
