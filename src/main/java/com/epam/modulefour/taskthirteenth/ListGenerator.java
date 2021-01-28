package com.epam.modulefour.taskthirteenth;


import java.util.ArrayList;
import java.util.List;

public class ListGenerator {
    public List<City>createCitiesList() {

        List<City>cities = new ArrayList<>();

        City city = new City(1, "Mordor", true, true, 1);
        cities.add(city);
        City city1 = new City(2, "Barad-Dur", false, false, 1);
        cities.add(city1);
        City city2 = new City(3, "Rigard", false, false, 1);
        cities.add(city2);

        City city3 = new City(4, "Orodruin", false, true, 2);
        cities.add(city3);
        City city4 = new City(5, "Minas-Thyrit", false, false, 2);
        cities.add(city4);
        City city5 = new City(6, "Icerock", false, false, 2);
        cities.add(city5);

        City city6 = new City(7, "Minas-Morgun", false, true, 3);
        cities.add(city6);
        City city7 = new City(8, "Dormord", false, false, 3);
        cities.add(city7);
        City city8 = new City(9, "BlackWaterFall", false, false, 3);
        cities.add(city8);

        return cities;
    }

    public List<District>createDistinctesList() {
        List<District>districts = new ArrayList<>();

        District district = new District(1,  1, 3056.2);
        districts.add(district);
        District district1 = new District(2, 1, 2440.5);
        districts.add(district1);

        District district2 = new District(3, 2, 1453.0);
        districts.add(district2);
        District district3 = new District(4,2, 2200.7);
        districts.add(district3);

        District district4 = new District(5,3, 4565.8);
        districts.add(district4);
        District district5 = new District(6, 3, 4322.9);
        districts.add(district5);

        return districts;
    }

    public List<Region>createRegionsList() {
        List<Region>regions = new ArrayList<>();

        Region region = new Region(1,1);
        regions.add(region);
        Region region1 = new Region(2,1);
        regions.add(region1);
        Region region2 = new Region(3,1);
        regions.add(region2);

        return regions;
    }
}
