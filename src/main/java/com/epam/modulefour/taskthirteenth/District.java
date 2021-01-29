package com.epam.modulefour.taskthirteenth;


public class District {
    private int idDistrict;
    private int idRegion;
    private double square;


    public District(int idDistrict, int idRegion, double square) {
        this.idDistrict = idDistrict;
        this.idRegion = idRegion;
        this.square = square;

    }

    public int getIdRegion() {
        return idRegion;
    }

    public double getSquareOfDistrict(){
        return square;
    }
}
