package com.epam.modulefive.taskfive.composition.flower.flowercontainer;

import com.epam.modulefive.taskfive.composition.colour.ColourVariant;

import java.util.Objects;

public abstract class Flower {
    protected ColourVariant colourVariant;

    public ColourVariant getColourVariant() {
        return colourVariant;
    }

    public void setColourVariant(ColourVariant colourVariant) {
        this.colourVariant = colourVariant;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return colourVariant == flower.colourVariant;
    }

    @Override
    public int hashCode() {
        return Objects.hash(colourVariant);
    }
}
