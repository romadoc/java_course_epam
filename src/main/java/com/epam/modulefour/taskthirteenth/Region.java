package com.epam.modulefour.taskthirteenth;


import java.util.List;

public class Region {
    private int idRegion;
    private double squareOfRegion;
    private int idState;
    private List<District> districtsOfRegions;

    public Region(int idRegion, int idState) {
        this.idRegion = idRegion;
        this.idState = idState;

    }

    public double getRegionSquare(List<District>districtList) {

        for (District s: districtList) {
            if(idRegion == s.getIdRegion()) {
                squareOfRegion = squareOfRegion + s.getSquareOfDistrict();
            }
        }
        return squareOfRegion;
    }

}
