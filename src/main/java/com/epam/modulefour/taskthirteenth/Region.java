package com.epam.modulefour.taskthirteenth;


import java.util.List;

public class Region {
    private int idRegion;
    private double square;
    private int upLevelKey;
    private List<District> districtsOfRegions;

    public Region(int idRegion, double square, int upLevelKey) {
        this.idRegion = idRegion;
        this.square = square;
        this.upLevelKey = upLevelKey;
    }
    public Region(int idRegion, double square, int upLevelKey, List<District>districtList) {
        this.idRegion = idRegion;
        this.square = square;
        this.upLevelKey = upLevelKey;
        for (District s: districtList) {
            if (s.getUpLevelKey() == idRegion) {
                assert districtsOfRegions != null;
                districtsOfRegions.add(s);
            }
        }
    }


    public int getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(int idRegion) {
        this.idRegion = idRegion;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public int getUpLevelKey() {
        return upLevelKey;
    }

    public void setUpLevelKey(int upLevelKey) {
        this.upLevelKey = upLevelKey;
    }

    public List<District> getDistrictsOfRegions() {
        return districtsOfRegions;
    }

    public void setDistrictsOfRegions(List<District> districtsOfRegions) {
        this.districtsOfRegions = districtsOfRegions;
    }
}
