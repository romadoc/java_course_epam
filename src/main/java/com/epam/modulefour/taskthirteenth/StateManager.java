package com.epam.modulefour.taskthirteenth;

import java.util.List;

public class StateManager {

    public static void main(String[] args) {
       ListGenerator listGenerator = new ListGenerator();
       List<City> cityList = listGenerator.createCitiesList();
       List<District>districtList = listGenerator.createDistinctesList();
       List<Region>regionList = listGenerator.createRegionsList();



        State state = new State(1, "Mordoria", cityList,
                                districtList, regionList);

        state.printStateInfo();
    }
}
