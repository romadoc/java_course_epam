package com.epam.modulefive.taskfour.dragoncave;

public class Treasure {
    private int iD;
    private String treasureName;
    private String description;
    private int priceCents;

    public String getTreasureName() {
        return treasureName;
    }

    public void setTreasureName(String treasureName) {
        this.treasureName = treasureName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriceCents() {
        return priceCents;
    }

    public void setPriceCents(int priceCents) {
        this.priceCents = priceCents;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    @Override
    public String toString() {
        return "Treasure id: " + iD + ", treasureName - "
                                    + treasureName
                                    + ", description - "
                                    + description
                                    + ", price - "
                                    + priceCents
                                    + " cents";
    }
}
