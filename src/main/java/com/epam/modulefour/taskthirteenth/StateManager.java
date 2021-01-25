package com.epam.modulefour.taskthirteenth;

public class StateManager {

    public static void main(String[] args) {
        ListGenerator listGenerator = new ListGenerator();
        listGenerator.createCitiesList();
        listGenerator.createDistinctesList();
        listGenerator.createRegionsList();

        State state = new State(1, "Mordoria", listGenerator.createCitiesList(),
                                listGenerator.createDistinctesList(), listGenerator.createRegionsList());

        state.printStateInfo();
    }
}
