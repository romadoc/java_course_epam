package com.epam.modulefive.taskfive.composition.flower.flowercontainer;

import com.epam.modulefive.taskfive.composition.colour.ColourVariant;

public abstract class Flower {
    private ColourVariant colourVariant;

    public ColourVariant getColourVariant() {
        return colourVariant;
    }

    public void setColourVariant(ColourVariant colourVariant) {
        this.colourVariant = colourVariant;
    }


}
