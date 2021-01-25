package com.epam.modulefour.taskthirteenth;


import java.util.List;

public class District {
    private int idDistrict;
    private int upLevelKey;
    private List<City> citiesOfDistrict;

    public District(int idDistrict, int upLevelKey) {

    }

    public District(int idDistrict, int upLevelKey, List<City>cityList) {
        this.idDistrict = idDistrict;
        this.upLevelKey = upLevelKey;
        for (City s: cityList) {
            if(s.getUpLevelKey() == idDistrict){
                assert citiesOfDistrict != null;
                citiesOfDistrict.add(s);
            }

        }

    }



    public int getIdDistrict() {
        return idDistrict;
    }

    public void setIdDistrict(int idDistrict) {
        this.idDistrict = idDistrict;
    }

    public int getUpLevelKey() {
        return upLevelKey;
    }

    public void setUpLevelKey(int upLevelKey) {
        this.upLevelKey = upLevelKey;
    }

    public List<City> getCitiesOfDistrict() {
        return citiesOfDistrict;
    }

    public void setCitiesOfDistrict(List<City> citiesOfDistrict) {
        this.citiesOfDistrict = citiesOfDistrict;
    }
}
