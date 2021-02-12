package com.epam.modulefive.taskfour.menu;

public enum Headmenu {
    ALL("1-show all treasures"),
    MAST_EXPENSIVE("2-show mast expensive treasure"),
    BUY_TREASURE("3-buy a treasure");

    private String explanation;

    Headmenu(String explanation) {
        this.explanation = explanation;
    }

    public String getExplanation() {
        return explanation;
    }
}
